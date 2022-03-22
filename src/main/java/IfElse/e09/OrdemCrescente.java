package IfElse.e09;

import java.util.Arrays;
import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vet = new int[3];
        for(int x = 0; x <= 2; x++){
            System.out.println("Informe o " + (x + 1) + "° número:");
            vet[x] = scan.nextInt();
        }
        Arrays.sort(vet); // coloca o array em ordem crescente.
        for(int y = vet.length - 1; y >= 0 ; y--){ // For para imprimir em ordem decrescente
            System.out.println(vet[y]);
        }
    }
}