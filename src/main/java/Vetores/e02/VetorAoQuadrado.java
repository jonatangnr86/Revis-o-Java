package Vetores.e02;

public class VetorAoQuadrado {
    public static void main(String[] args) {
        int[] vetor1 = new int[15];
        int[] vetor2 = new int[15];

        for(int x = 0; x < vetor1.length; x++){
            vetor1[x] = x + 1;
            vetor2[x] = ((int) Math.pow(vetor1[x], 2));
        }
        for(int y = 0; y < vetor1.length; y++){
            System.out.println(vetor1[y] + " Elevado a 2 = " +vetor2[y]);
        }
    }
}
