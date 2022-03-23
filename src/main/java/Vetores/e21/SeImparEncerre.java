package Vetores.e21;

public class SeImparEncerre {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 2 + (int) (Math.random() * 2);
            System.out.print(vetor[i] + " ");
        }
        for (int j = 0; j < vetor.length; j++) {
            System.out.print(vetor[j] + ", ");
            if (vetor[j] % 2 != 0) {
                System.out.println("\nNúmero impar " + vetor[j] + " encontrado na posição " + (j + 1) + ".");
                System.exit(0);
            }
        }
    }
}

