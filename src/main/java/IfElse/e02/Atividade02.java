package IfElse.e02;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int number1 = scan.nextInt();

        if (number1 > 0) {
            System.out.println("O númmero é positivo");
        } else if (number1 == 0) {
            System.out.println("O número é nulo.");
        } else {
            System.out.println("O número é negativo.");
        }
    }
}

