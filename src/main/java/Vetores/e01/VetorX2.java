package Vetores.e01;

public class VetorX2 {
    public static void main(String[] args) {
        int[] vetA = new int[8];
        int[] vetB = new int[8];

        for (int x = 0; x < vetA.length; x++) {
            vetA[x] = x + 1;
            vetB[x] = vetA[x] * 2;
        }
        for (int y = 0; y < vetA.length; y++) {
            System.out.println(vetA[y]);
            System.out.println(vetB[y]);
        }
    }
}
