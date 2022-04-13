package Atividade.ex05ClasseAlunos;


import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aluno<pulbic> {
    private String nomeAluno;
    private Integer matricula;
    private String curso;
    private Map<String, List<Integer>> disciplinas = new HashMap<>();
    private List<String> disciplina = new ArrayList<>();
    private List<Integer> notas = new ArrayList<>();
    private List<Integer> media = new ArrayList<>();
    int med;

    public String realizarLeitura(String msg) {
        return JOptionPane.showInputDialog(msg);
    }

    public Integer realizarLeituraInteger(String msg) {
        while (true) {
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(msg));
            } catch (NumberFormatException nfe0) {
                JOptionPane.showMessageDialog(null, "Número Inválido!");
            }
        }
    }

    public double realizarLeituraDouble(String msg) {
        while (true) {
            try {
                return Double.parseDouble(JOptionPane.showInputDialog(msg));
            } catch (NumberFormatException nfe0) {
                JOptionPane.showMessageDialog(null, "Número Inválido!");
            }
        }
    }


    public void disciplinasNotas() {

        for (int i = 0; i < 3; i++) {
            med = 0;
            getDisciplina().add(realizarLeitura("Infome nome da disciplina"));
            getDisciplinas().put(getDisciplina().get(i), new ArrayList<>());

            for (int j = 0; j < 3; j++) {
                int nota = realizarLeituraInteger("Informe a " + (j + 1) + "° nota: ");
                getNotas().add(nota);
                med = med + nota;
            }
            getMedia().add(med / 3);
            getDisciplinas().get(getDisciplina().get(i)).add(getMedia().get(i));
        }
    }


    public void imprimi() {

        for (Map.Entry<String, List<Integer>> m : disciplinas.entrySet()) {
            System.out.println(m.getValue());

            if(m.hashCode()>= 70) {
                System.out.println("Disciplina " + m.getKey() + " Media " + m.getValue() + " Aprovado!");
            }else {
                System.out.println("Disciplina " + m.getKey() + " Media " + m.getValue() + " Reprovado!");
            }
        }
    }

    public List<Integer> getMedia() {
        return media;
    }

    public void setMedia(List<Integer> media) {
        this.media = media;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Map<String, List<Integer>> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Map<String, List<Integer>> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<String> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(List<String> disciplina) {
        this.disciplina = disciplina;
    }
}
