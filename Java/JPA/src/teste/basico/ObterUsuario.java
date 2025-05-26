package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ObterUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = em.find(Usuario.class, 1L); // 2 param = identifier (1L = 1 Long)
        System.out.printf("Nome: %s | Email: %s | ID: %d\n", usuario.getNome(), usuario.getEmail(), usuario.getId());

        // tambem podemos usar native queries com
        // em.createNativeQuery();

        em.close();
        emf.close();
    }
}
