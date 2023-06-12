package org.example.teste.UmPraMuitos;

import org.example.basico.UmPraMuitos.ItemPedido;
import org.example.basico.UmPraMuitos.Pedido;
import org.example.infra.DAO;

public class ObterPedidosMuitos {
    public static void main(String[] args) {

        DAO<Pedido> dao = new DAO<>(Pedido.class);

        Pedido pedido = dao.obterPorID(1L);

        for(ItemPedido item: pedido.getItens()){
            System.out.println(item.getQuantidade());
            System.out.println(item.getProduto().getNome());
        }

        dao.fechar();

    }
}
