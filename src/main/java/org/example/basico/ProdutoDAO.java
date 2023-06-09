package org.example.basico;

import org.example.infra.DAO;

public class ProdutoDAO  extends DAO<Produto> {

    public ProdutoDAO() {
        super(Produto.class);
    }
}
