package ArrayList.e14;

import java.util.*;
import java.util.ArrayList;

public class AlunoNotaMedia {
    public static void main(String[] args) {
        Map<String, List<Integer>> alunos = new HashMap<>();
        List<String> aluno = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Informe o nome do Aluno: ");
            aluno.add(scan.next());
            alunos.put(aluno.get(i), new ArrayList<>());

            for (int j = 0; j < 2; j++) {
                System.out.println("Informe a " + (j + 1) + "° nota:");
                alunos.get(aluno.get(i)).add(scan.nextInt());
            }
        }
        for (Map.Entry<String, List<Integer>> m : alunos.entrySet()) {
            System.out.println("Aluno: " + m.getKey() + " || Notas " + m.getValue());
        }
    }
}
