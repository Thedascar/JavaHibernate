package org.example.teste;

import org.example.basico.Produto;
import org.example.infra.DAO;

public class NovoProduto {
    public static void main(String[] args) {

        DAO<Produto> dao = new DAO<>(Produto.class);

        Produto produto = new Produto("Notebook",6999.61);

        dao.incluirAtomico(produto).fechar();
    }
}
