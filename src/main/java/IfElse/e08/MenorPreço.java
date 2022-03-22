package IfElse.e08;

import java.util.Scanner;

public class MenorPreço {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float menorValor = 0;
        int posicao = 0;
        for (int x = 0; x <3; x++){
            System.out.println("Informe  " + (x + 1) + "° valor:");
            float valor = scan.nextFloat();
            if (valor < menorValor || menorValor == 0){
                menorValor = valor;
                posicao = x++;
            }
        }
        System.out.println( "O menor preço é do " + posicao + "° produto com valor de R$" + menorValor );
    }
}
