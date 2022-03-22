package IfElse.e07;

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int menor = 0;
       int maior = 0;
       int valor = 0;
        for(int x = 0; x < 3; x++){
            System.out.println("Digite o " + (x  + 1) + "° número: ");
            valor = scan.nextInt();
            if (valor > maior || maior == 0){
                maior = valor;
            } else if (valor < menor || menor == 0){
                menor = valor;
            }
        }
        System.out.println("O maior é: " + maior + " o menor é: " + menor);
    }
}
