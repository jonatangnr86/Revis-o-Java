package ArrayList.e13;

import java.util.ArrayList;
import java.util.List;

public class AcheErro {
    public static void main(String[] args) {

       /* int[] vetor = new int[]{2, 4, 6, 8, 10, 12};
        for (int i = 0; i <= 12; i++) {
            System.out.println(vetor[i]);

        O vertor tem 6 posições e o for executa <= 12

        */
        List<Integer> lista = new ArrayList<>();
        int[] vetor = new int[]{2, 4, 6, 8, 10, 12};

        for (int i = 0; i < vetor.length; i++) {
                lista.add(vetor[i]);
        }
        for (Integer x : lista) System.out.print(x + ", ");
    }
}
