package Vetores.e03;

public class VeterRaizQuadrada {
    public static void main(String[] args) {
        int[] vetor1 = new int[15];
        double[] vetor2 = new double[15];

        for(int x = 0; x < vetor1.length; x++){
            vetor1[x] = x + 1;
            vetor2[x] = (Math.sqrt(vetor1[x]));
        }
        for(int y = 0; y < vetor1.length; y++){
            System.out.println(vetor1[y] + " sua raiz quadrada é  = " +vetor2[y]);
        }
    }
}
