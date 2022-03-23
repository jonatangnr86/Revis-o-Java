package Vetores.e12;

public class vetorMultiplo5 {
    public static void main(String[] args) {
        int[] vetor1 = new int[10];

        int valor = 0;

        for (int x = 0; x < vetor1.length; x++) {
            vetor1[x] = x + 1;
            System.out.println(vetor1[x]);
            if (vetor1[x] % 5 == 0) {
                valor = valor + 1;
            }
        }
        System.out.println("Qdt de números multiplos de 5: " + valor);
    }
}
