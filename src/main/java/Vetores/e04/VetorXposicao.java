package Vetores.e04;

public class VetorXposicao {
    public static void main(String[] args) {
        int[] vetor1 = new int[15];
        int[] vetor2 = new int[15];

        for(int x = 0; x < vetor1.length; x++){
            vetor1[x] = x + 1;
            vetor2[x] = vetor1[x] * x;
        }
        for(int y = 0; y < vetor1.length; y++){
            System.out.println(vetor1[y] + " x sua posição = " +vetor2[y]);
        }
    }
}
