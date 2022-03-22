package IfElse.e06;

import java.util.Scanner;

public class MaiorDeTres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maior = 0;
        for (int x = 0; x < 3; x++) {
            System.out.println("Informe o " + (x + 1) + "° valor: ");
            int valor1 = scan.nextInt();
            if (valor1 > maior) {
                maior = valor1;
            }
        }
        System.out.println("O maior valor inserido é: " + maior);
    }
}
