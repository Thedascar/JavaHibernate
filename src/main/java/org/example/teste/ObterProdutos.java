package org.example.teste;

import org.example.basico.Produto;
import org.example.basico.ProdutoDAO;
import org.example.infra.DAO;

import java.util.List;

public class ObterProdutos{

    public static void main(String[] args) {

        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produtos = dao.obterTodos();

        for (Produto produtoss: produtos){
            System.out.println("ID " + produtoss.getId() +
                    ", Nome: " + produtoss.getNome());
        }


        double precoTotal = produtos.stream()
                .map(p -> p.getPreco())
                .reduce(0.0,(t,p) -> t + p)
                .doubleValue();

        System.out.println("O valor total é R$ " + precoTotal);

        dao.fecharT();
    }


}
