package org.example.teste.UmPraUm;

import org.example.basico.UmPraUm.Assento;
import org.example.basico.UmPraUm.Cliente;
import org.example.infra.DAO;

public class NovoClienteAssento1 {
    public static void main(String[] args) {

        Assento assento = new Assento("22j");
        Cliente cliente = new Cliente("jose",assento);

        DAO<Object> dao = new DAO<>();

        dao.abrirT()
                .incluir(assento)
                .incluir(cliente)
                .fecharT()
                .fechar();


    }
}
