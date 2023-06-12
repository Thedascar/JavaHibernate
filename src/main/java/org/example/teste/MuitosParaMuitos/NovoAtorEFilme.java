package org.example.teste.MuitosParaMuitos;

import org.example.basico.MuitosParaMuitos.Ator;
import org.example.basico.MuitosParaMuitos.Filme;
import org.example.infra.DAO;


public class NovoAtorEFilme {
    public static void main(String[] args) {

         Filme filme1 = new Filme("A luta",8.9);
         Ator ator1 = new Ator("Jorge Locao");
         Ator ator2 = new Ator("Veiga Morder");


         Filme filme2 = new Filme("A grande vitoria",8.1);


         filme1.adicionarAtor(ator1);
         filme1.adicionarAtor(ator2);
         filme2.adicionarAtor(ator1);

         DAO<Filme> dao = new DAO<>();
         dao.incluirAtomico(filme1);
    }
}
