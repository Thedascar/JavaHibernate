package org.example.teste;

import org.example.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario1 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("java_primeiro");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class,4L);
        usuario.setNome("Aline Lima");
        usuario.setEmail("Alinealine@hotmail.com");

        em.merge(usuario);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
