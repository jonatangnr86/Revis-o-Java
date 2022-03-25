package ArrayList.e03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class e03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            lista.add((int) Math.round(Math.random() * 50));
        }

        System.out.println(lista);
       boolean cont = true;
        Integer c = 1;

        while(cont){
            cont = false;
            for (Integer x : lista) {
                if (x % 2 != 0) {
                    c = x;
                    cont = true;
                }
            }
            lista.remove(c); //Não remove da lista emquanto esta sendo percorrida
        }
        System.out.println(lista);
    }
}
