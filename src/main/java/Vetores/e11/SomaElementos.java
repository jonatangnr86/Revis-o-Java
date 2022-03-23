package Vetores.e11;

public class SomaElementos {
    public static void main(String[] args) {
        int[] vetor1 = new int[10];
        int soma = 0;


        for (int x = 0; x < vetor1.length; x++) {
            vetor1[x] = x + 1;
            soma = soma + vetor1[x];
        }
        System.out.println("A soma de todos os elementos é: " + soma);
    }
}
