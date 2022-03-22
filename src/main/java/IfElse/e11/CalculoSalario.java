package IfElse.e11;

import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Calculador calc = new Calculador();
        boolean vld = false;

        while (!vld) {
            System.out.println("Informe o valor do salário: ");
            double valor = scan.nextFloat();
            if (valor > 0) {
                if (valor < 280) {
                    System.out.println("Salário normal R$" + valor + " \nCom reajuste 20% R$ " + calc.vinte(valor));
                } else if (valor >= 280 && valor <= 700) {
                    System.out.println("Salário normal R$" + valor + " \ncom reajuste 15% R$ " + calc.quinze(valor));
                } else if (valor > 700 && valor <= 1500) {
                    System.out.println("Salário normal R$" + valor + "com reajuste 10% R$ " + calc.dez(valor));
                } else if (valor > 1500) {
                    System.out.println("Salário normal R$" + valor + "com reajuste 5% R$ " + calc.cinco(valor));
                }
                vld = true;
            } else {
                System.out.println("Salario deve ser > 0");
            }
        }
    }
}
