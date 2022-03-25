package ArrayList.e09;

import java.util.ArrayList;
import java.util.List;

public class InterseccaoUniao {
    public static void main(String[] args) {
        List<Integer> listaA = new ArrayList<>();
        List<Integer> listaB = new ArrayList<>();
        List<Integer> listaC = new ArrayList<>();
        List<Integer> listaD = new ArrayList<>();

        for (int i = 0; i < 51; i++) {
            listaA.add(i);
        }
        for (int j = 0; j < 60; j++) {
            listaB.add(j * 2);
        }
        for (Integer k : listaA) { // Lista menor
            for (Integer j : listaB) {  // Lista maior
                if (k == j) {
                    listaC.add(j);  // recebe da lista maior
                } if (k != j){
                    listaD.add(j);  // recebe da lista maior
                }
            }
        }
        System.out.println(listaA);
        System.out.println(listaB);
        System.out.println(listaC);
        System.out.println(listaD);
    }
}