package Vetores.e01;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(); // Cria array lista
        List<Integer> lista2 = new ArrayList<>(); // Cria array lista

        lista.add(1); //Adiciona valor 1 a lista
        lista.add(3);
        lista.add(5);
        lista.add(7);
        lista.add(9);
        lista.add(11);
        lista.add(13);
        lista.add(15);


        for (int i = 0; i < 8; i++) {
            System.out.println(lista.get(i));
           // lista2.add(i * 2);
        }
         /*ira percorrer a lista ate o ultimo elemento
         incrementando a j o valor que esta na lista*/
        for (Integer j : lista) {
            lista2.add(j * 2);
        }
        System.out.println(lista); // Imprime toda a lista
        System.out.println(lista2); // Imprime toda lista2
    }
}
