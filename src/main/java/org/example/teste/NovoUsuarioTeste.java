package org.example.teste;

import org.example.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuarioTeste {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("java_primeiro");
        EntityManager em = emf.createEntityManager();


        Usuario novoUsuario = new Usuario("Jose Benicio"
                , "JoseBenicio@hotmail.com");
        em.getTransaction().begin();
        em.persist(novoUsuario);
        em.getTransaction().commit();


        em.close();
        emf.close();




    }
}
