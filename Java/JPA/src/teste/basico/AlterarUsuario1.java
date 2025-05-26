package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario1 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 3L);
        usuario.setNome("João");

        em.merge(usuario); // mesmo que em.merge seja comentado ou excluido, a alteração ainda acontece
                           // porque o em.find cria uma sincronia com o objeto, acontecendo quando o setter é chamado
        em.getTransaction().commit();


        em.close();
        emf.close();
    }
}
