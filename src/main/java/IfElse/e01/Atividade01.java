package IfElse.e01;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        float number1 = scan.nextFloat();
        System.out.println("Informe o segundo número: ");
        float number2 = scan.nextFloat();

        if (number1 > number2) {
            System.out.println(number1 + " é maior que " + number2);
        } else {
            System.out.println(number2 + " é maior que " + number1);
        }
    }
}
