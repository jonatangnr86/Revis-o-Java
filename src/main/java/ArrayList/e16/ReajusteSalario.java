package ArrayList.e16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> nome = new ArrayList<>();
        List<Double> salario = new ArrayList<>();
        boolean vld = false;

        while (!vld) {
            System.out.println("Quantos Funcionarios deseja informar?");
            int number = scan.nextInt();
            if (number > 0) {
                for(int i = 0; i < number; i++) {
                    System.out.println("Nome do " + (i + 1) + "° funcionário:");
                    nome.add(scan.next());
                    System.out.println("Salário do funcionário: ");
                    double sal = scan.nextInt();
                    salario.add(sal + (sal * 0.11));
                }
                vld = true;
            } else {
                System.out.println("Inválido");
            }
        }
        for(int j = 0; j < salario.size(); j++){
            System.out.println("Funcionário " + nome.get(j) + " Salário com reajuste R$ " + salario.get(j));
        }
    }
}
