package ArrayList.e08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InverteArray {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        for(int i = 0; i < 100; i++){
            lista.add(i);
        }
        System.out.println("Lista Original: \n" + lista);
        Collections.reverse(lista);
        System.out.println("Lista invertida: \n" + lista);

    }
}
