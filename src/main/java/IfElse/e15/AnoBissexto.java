package IfElse.e15;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um ano:");
        int ano = scan.nextInt();

        if ((ano % 4 == 0) && (ano % 100 != 0)) {   // quando o ano for menor que 400
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto");
        }
    }
}
