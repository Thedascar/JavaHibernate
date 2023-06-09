package org.example.teste;

import org.example.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ObterUsuario {
    public static void main(String[] args) {


    EntityManagerFactory emf = Persistence
            .createEntityManagerFactory("java_primeiro");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = em.find(Usuario.class,4L);
        System.out.println(usuario.getNome());


        em.close();
        emf.close();

    }
}
