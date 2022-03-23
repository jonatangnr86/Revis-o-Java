package Vetores.e14;

public class PorcentualVetor {
    public static void main(String[] args) {
        int[] vetor1 = new int[10];
        int impar = 0;

        for (int x = 0; x < vetor1.length; x++) {
            vetor1[x] = x + 1;
            if (vetor1[x] % 2 != 0) {
                impar = impar + 1;          // recebe a quantidade de números impores
            }
        }
        double porcento = (double) (impar * 100) / vetor1.length;
        System.out.println("A quantidade de números impares é de: " + porcento + "%.");
    }
}
