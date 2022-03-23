package Vetores.e09;

public class RestoDivisaoVetor {
    public static void main(String[] args) {
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];

        for (int x = 0; x < vetor1.length; x++) {
            vetor1[x] = x + 1;
            vetor2[x] = vetor1[x] % 2;
        }
        for (int y = 0; y < vetor2.length; y++) {
            System.out.println("Resto da divisão de " + vetor1[y] + " por 2 é: " + vetor2[y]);
        }
    }
}
