package Heranca.Humano;

import java.util.ArrayList;
import java.util.List;

public class TesteMain {
    public static void main(String[] args) {

        List<SerHumanoSC> lista = new ArrayList<>(); // Cria lista ser humano instanciada a super Classe
        lista.add(new Aluno(1234));   // add Aluno a lista
        lista.add(new Professor()); // add professor a lista
        lista.add(new Coordenador());  // add Coordenador a lista

        for (SerHumanoSC s : lista) {
            System.out.print(s.getClass());
            if (s.ValidaCodigo()) {  // Se houver uma matricula valida retorna true
                System.out.println(" Válido ");
            } else {                 // Se não houver uma matricula valida retorna false
                System.out.println(" Iválido");
            }
        }

//        Professor p = new Professor();
//        Aluno a = new Aluno();
//        Funcionario f = new Funcionario();
//
//        p.getEndereco().getMunicipio().getEstado().getNomeEstado();
//        a.getEndereco().getMunicipio().getEstado().getNomeEstado();
//        f.getEndereco().getMunicipio().getEstado().getNomeEstado();

    }
}
