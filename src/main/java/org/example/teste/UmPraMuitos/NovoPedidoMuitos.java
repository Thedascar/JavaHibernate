package org.example.teste.UmPraMuitos;

import org.example.basico.Produto;
import org.example.basico.UmPraMuitos.ItemPedido;
import org.example.basico.UmPraMuitos.Pedido;
import org.example.infra.DAO;

import java.io.ObjectStreamException;

public class NovoPedidoMuitos {
    public static void main(String[] args) {


        DAO<Object> dao = new DAO<>();


        Pedido pedido = new Pedido();
        Produto produto = new Produto("Notebook",3999.98);
        ItemPedido item = new ItemPedido(pedido,produto,5);



        dao
                .abrirT()
                .incluir(produto)
                .incluir(pedido)
                .incluir(item)
                .fecharT()
                .fechar();

    }
}
