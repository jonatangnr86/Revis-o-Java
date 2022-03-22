package IfElse.e17;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Operadores op = new Operadores();
        boolean vld = false;
        String ope = "+-/*";
        while (!vld) {
            System.out.println("Informe o 1° número:");
            double number1 = scan.nextDouble();
            System.out.println("Inforne a opreração:\n- Subtrai\n+ Adicção\n/ Divisão\n* Multiplica ");
            String operador = scan.next();
            if (ope.contains(operador.toLowerCase())) {
                System.out.println("Informe o 2° número");
                double number2 = scan.nextDouble();
                if (operador.equals("+")) {
                    op.adicao(number1, number2);
                } else if (operador.equals("-")) {
                    op.subtrai(number1, number2);
                } else if (operador.equals("*")) {
                    op.multiplica(number1, number2);
                } else if (operador.equals("/")) {
                    op.divide(number1, number2);
                }
                vld = true;
            } else {
                System.out.println("Operador inválido!");
            }
        }
    }
}
