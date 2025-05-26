package infra;

import modelo.basico.Entidade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class DAO<E extends Entidade>{

    private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<E> classe;

    static {
        try {
            emf = Persistence.createEntityManagerFactory("JPA");
        } catch (Exception e) {
            // logar -> log4j
        }
    }

    public DAO() {
        this(null);
    }

    public DAO(Class<E> classe) {
        this.classe = classe;
        em = emf.createEntityManager();
    }

    public DAO<E> abrirTransacao() {
        em.getTransaction().begin();
        return this;
    }

    public DAO<E> fecharTransacao() {
        em.getTransaction().commit();
        return this;
    }

    public DAO<E> fechar() {
        em.close();
        emf.close();
        return this;
    }

    public DAO<E> incluir(Entidade entidade) {
        em.persist(entidade);
        return this;
    }

    public DAO<E> incluirAtomico(Entidade entidade) {
        return this.abrirTransacao().incluir(entidade).fecharTransacao();
    }

    public List<E> obterTodos() {
        return this.obterTodos(10, 0);
    }

    public List<E> obterTodos(int quantidade, int deslocamento) {
        if(classe == null) {
            throw new UnsupportedOperationException("Classe Nula");
        }

        String jpql = "select e from "+classe.getName()+" e";
        TypedQuery<E> query = em.createQuery(jpql, classe);
        query.setMaxResults(quantidade);
        query.setFirstResult(deslocamento);
        return query.getResultList();
    }

}
