package Vetores.e10;

public class QdtNumerosPares {
    public static void main(String[] args) {
        int[] vetor1 = new int[10];
        int par = 0;
        int impar = 0;

        for (int x = 0; x < vetor1.length; x++) {
            vetor1[x] = x + 1;
            if (vetor1[x] % 2 == 0) {
                par = par + 1;
            } else {
                impar = impar + 1;
            }
        }
        System.out.println("qdt de números pares: " + par + " qdt de números impares: " + impar);
    }
}
