package Atividade.ex05ClasseAlunos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TesteAluno {
    public static void main(String[] args) {

        int nota;
        int med;

        Aluno aluno1 = new Aluno();

//            aluno1.setNomeAluno(aluno1.realizarLeitura("Informe o nome do Aluno: "));
//            aluno1.setMatricula(aluno1.realizarLeituraInteger("Informe número da matricula: "));
//            aluno1.setCurso(aluno1.realizarLeitura("Nome do curso: "));

            aluno1.disciplinasNotas();
            aluno1.imprimi();

    }
}
