package org.example.teste.MuitosParaMuitos;

import org.example.basico.MuitosParaMuitos.Ator;
import org.example.basico.MuitosParaMuitos.Filme;
import org.example.infra.DAO;

import java.util.List;

public class ObterFilmesNamedQueries {
    public static void main(String[] args) {

        DAO<Filme> dao = new DAO<>(Filme.class);
        List<Filme> filmes = dao.consultar(
                "ObterfilmesNotaMaiorQue",
                "nota", 8.5);


        for (Filme filme: filmes){
            System.out.println(filme.getNome() + " -> " + filme.getNota());

            for(Ator ator : filme.getAtores()){
                System.out.println(ator.getNome());
            }
        }
    }
}
