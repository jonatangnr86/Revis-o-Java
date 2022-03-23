package Vetores.e17;

import java.util.Arrays;

public class MaiorEmenorPosicao {
    public static void main(String[] args) {
        int[] idades = new int[10];
        double maior = 0, menor = 0;
        int indMaior = 0, indMenor = 0;

        System.out.print("Vetor original: ");
        for(int x = 0; x < idades.length; x++){
            idades[x] = x * 3;
            if(x == 5){
                idades[x] = x *20;
            }
            System.out.print(idades[x]+ ", ");
        }

        for(int i = 0; i < idades.length; i++){
            if(idades[i] > maior){
                maior = idades[i];   //Recebe o maior valor dentro do vetor
                menor = idades[i];   // carrega menor com o maior valor
                indMaior = i;
            }
        }
        for(int j = 0; j < idades.length; j++){
            if(idades[j] < menor){
                menor = idades[j];   //Recebe o menor valor dentro do vetor
                indMenor = j;
            }
        }
        System.out.println("\nO menor valor no vetor é: " + menor + " está na posição " + indMenor
                          + "\nO maior valor no vetor é: " + maior + " está na posição " + indMaior);
    }
}
