package ArrayList.e15;

import java.sql.SQLOutput;
import java.util.*;

public class MaioresNotas {
    public static void main(String[] args) {
        List<String> aluno = new ArrayList<>();
        List<Integer> media = new ArrayList<>();
        int med = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            med = 0;
            System.out.println("Informe o nome do aluno: ");
            aluno.add(scan.next());
            for (int j = 0; j < 2; j++) {
                System.out.println("Informe a " + (j + 1) + "° nota");
                med = (med + scan.nextInt());
            }
            media.add(med / 2);
        }
        for(int x = 0; x < aluno.size(); x++) {
            System.out.println("Aluno " + aluno.get(x) + " Média " + media.get(x));
        }
        System.out.println("Alunos com Média > 70: ");
        int cont = 0;
        for(Integer m : media){
            if (m > 70){
                System.out.println(aluno.get(cont));
                cont++;
            }
        }

    }
}
