package Vetores.e13;

public class e13 {
    public static void main(String[] args) {
        int[] vetor1 = new int[10];
        int impar = 0;
        double media = 0;
        for (int x = 0; x < vetor1.length; x++) {
            vetor1[x] = x + 1;
            if (vetor1[x] % 2 != 0) {
                impar = impar + 1;          // recebe a quantidade de números impores
                media = media + vetor1[x];  // recebe a soma dos números impares
            }
        }
        media = media / impar;               // Divide a soma de números impoares pela quantidade
        System.out.println("Qdt de números impares é: " + impar
                            + "\nMédia dos números impares é: " + media);
    }
}
