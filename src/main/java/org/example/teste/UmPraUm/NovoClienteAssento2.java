package org.example.teste.UmPraUm;

import org.example.basico.UmPraUm.Assento;
import org.example.basico.UmPraUm.Cliente;
import org.example.infra.DAO;

public class NovoClienteAssento2 {
    public static void main(String[] args) {

        Assento assento = new Assento("20v");
        Cliente cliente = new Cliente("maria",assento);

        DAO<Cliente> dao = new DAO<>(Cliente.class);
        dao.incluirAtomico(cliente);
    }
}
