package ArrayList.e01;

import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(); // Cria array list

        lista.add(2);
        lista.add(5);
        lista.add(3);
        lista.add(9);
        lista.add(2);
        lista.add(4);
        lista.add(3);
        lista.add(8);
        lista.add(5);

        Collections.sort(lista);
        System.out.println(lista);

        for(Integer x : lista){
            System.out.println(x);
        }

    }
}
