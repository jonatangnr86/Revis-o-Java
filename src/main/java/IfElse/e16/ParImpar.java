package IfElse.e16;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número inteiro:");
        int number = scan.nextInt();

        if(number % 2 == 0){
            System.out.println("O número " + number + " é par.");
        } else {
            System.out.println("O número " + number + " é impar.");
        }
    }
}
