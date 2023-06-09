package org.example.teste.UmPraUm;

import org.example.basico.UmPraUm.Assento;
import org.example.basico.UmPraUm.Cliente;
import org.example.infra.DAO;

public class ObterAssentoCliente {
    public static void main(String[] args) {

        DAO<Cliente> daoCliente = new DAO<>(Cliente.class);

        Cliente cliente = daoCliente.obterPorID(2L);
        System.out.println(cliente.getAssento().getNome());
        System.out.println(cliente.getAssento().getCliente().getNome());
        daoCliente.fechar();


        DAO<Assento> daoAssento = new DAO<>(Assento.class);
        Assento assento = daoAssento.obterPorID(4l);
        System.out.println(assento.getCliente().getNome());

        daoAssento.fechar();
    }
}
