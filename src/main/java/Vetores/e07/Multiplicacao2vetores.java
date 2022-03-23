package Vetores.e07;

public class Multiplicacao2vetores {
    public static void main(String[] args) {
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[10];

        for (int x = 0; x < vetor1.length; x++) {
            vetor1[x] = x + 1;
            vetor2[x] = x + 2;
            vetor3[x] = vetor1[x] * vetor2[x];
        }
        for (int y = 0; y < vetor3.length; y++) {
            System.out.println(vetor1[y] + " * " + vetor2[y] + " = " + vetor3[y]);
        }
    }
}
