package org.example.teste.MuitosParaMuitos;

import org.example.basico.MuitosParaMuitos.Sobrinho;
import org.example.basico.MuitosParaMuitos.Tio;
import org.example.infra.DAO;

public class NovoTioSobrinho {
    public static void main(String[] args) {

        Tio tio1 = new Tio("Edson");
        Tio tio2 = new Tio("Ana");

        Sobrinho sobrinho1 = new Sobrinho("Lucas");
        Sobrinho sobrinho2 = new Sobrinho("Aline");

        tio1.getSobrinhos().add(sobrinho1);
        sobrinho1.getTios().add(tio1);

        tio1.getSobrinhos().add(sobrinho2);
        sobrinho2.getTios().add(tio1);

        tio2.getSobrinhos().add(sobrinho1);
        sobrinho1.getTios().add(tio2);

        tio2.getSobrinhos().add(sobrinho2);
        sobrinho2.getTios().add(tio2);


        DAO<Object> dao = new DAO<>();
        dao.abrirT()
                .incluir(tio1)
                .incluir(tio2)
                .incluir(sobrinho1)
                .incluir(sobrinho2)
                .fecharT()
                .fechar();
    }
}
