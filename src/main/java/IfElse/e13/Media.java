package IfElse.e13;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        String conceito = "";
        String status = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a 1° nota:");
        float nota1 = scan.nextFloat();
        System.out.println("Informe 2° nota:");
        float nota2 = scan.nextFloat();

        float media = (nota1 + nota2) / 2;

        if (media >= 9 && media <= 10) {
            conceito = "A";
            status = "Aprovado";
        } else if (media >= 7.5 && media < 9) {
            conceito = "B";
            status = "Aprovado";
        } else if (media >= 6 && media < 7.5) {
            conceito = "C";
            status = "Aprovado";
        } else if (media <= 4 && media < 6) {
            conceito = "D";
            status = "Reprovado";
        } else if (media >= 0 && media < 4) {
            conceito = "E";
            status = "Reprovado";
        } else {
            System.out.println("Média inválida");
            System.exit(0);
        }
        System.out.println("Nota 1 = " + nota1
                + "\nNota 2 = " + nota2
                + "\nMédia = " + media
                + "\nConceito = " + conceito
                + "\nStatus =" + status);
    }
}
