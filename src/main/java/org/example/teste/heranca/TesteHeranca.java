package org.example.teste.heranca;

import org.example.basico.Heranca.Aluno;
import org.example.basico.Heranca.AlunoBolsista;
import org.example.infra.DAO;

public class TesteHeranca {
    public static void main(String[] args) {

        DAO<Aluno> alunoDAO = new DAO<>();

        Aluno aluno1 = new Aluno(123L,"Josieldo");
        AlunoBolsista aluno2 = new AlunoBolsista(321L,"Lucass",2500.87);
        alunoDAO.incluirAtomico(aluno1);
        alunoDAO.incluirAtomico(aluno2);

        alunoDAO.fechar();
    }
}
