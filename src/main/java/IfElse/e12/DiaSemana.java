package IfElse.e12;

import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean vld = false;
        int dia;
        while (!vld) {
            System.out.println("Escolha um número de 1 a 7:");
            dia = scan.nextInt();
            if (dia >= 1 && dia <= 7) {
                switch (dia) {
                    case 1:
                        System.out.println("Domingo");
                        break;
                    case 2:
                        System.out.println("Segunda Feira");
                        break;
                    case 3:
                        System.out.println("Terça Feira");
                        break;
                    case 4:
                        System.out.println("Quarta Feira");
                        break;
                    case 5:
                        System.out.println("Quinta Feira");
                        break;
                    case 6:
                        System.out.println("Sexta Feira");
                        break;
                    case 7:
                        System.out.println("Sábado");
                        break;
                }
                vld = true;
            } else {
                System.out.println("O digito deve se de 1 a 7");
            }
        }
    }
}
