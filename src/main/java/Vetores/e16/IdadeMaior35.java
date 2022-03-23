package Vetores.e16;

import java.util.Arrays;

public class IdadeMaior35 {
    public static void main(String[] args) {
        int[] idades = new int[10];
        double maior = 0;

        System.out.print("Vetor original: ");
        for(int x = 0; x < idades.length; x++){
            idades[x] = x * 3;
            if(x == 5){
                idades[x] = x *20;
            }
            System.out.print(idades[x]+ ", ");
        }

        Arrays.sort(idades);         // Ordena o vertor em ordem crescente.

        System.out.print("\nVetor ordenado crescente: ");
        for(int i = 0; i < idades.length; i++){
            System.out.print(idades[i]+ ", ");
            if(idades[i] > maior){
                maior = idades[i];   //Recebe o maior valor dentro do vetor
            }
        }
        System.out.print("\nVetor ordenado decrescente: ");
        for(int j = idades.length - 1; j >= 0; j--){
            System.out.print(idades[j] + ", ");
        }
        System.out.println("\nA maior idade é: " + maior);
    }
}
