package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario2 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 3L);
        em.detach(usuario); // detach não permite que a atualização aconteça apenas pela sincronia do JPA, mas vai acontecer pelo em.merge + comit

        usuario.setNome("João");
        
        em.merge(usuario);
        em.getTransaction().commit();


        em.close();
        emf.close();
    }
}
