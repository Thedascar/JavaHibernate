package org.example.teste.MuitosParaMuitos;


import org.example.infra.DAO;

public class ObterMediasNativeQueries {
    public static void main(String[] args) {

        DAO<NotaFilmeNativeQueries> dao = new DAO<>(NotaFilmeNativeQueries.class);

       NotaFilmeNativeQueries nota = dao.consultarUm("obterMediaGeral");
        System.out.println(nota.getMedia());

        dao.fechar();
    }
}
