package ArrayList.e12;

import java.util.ArrayList;
import java.util.List;

public class Multiplicacao {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        List<Integer> lista3 = new ArrayList<>();

        for (int i = 0; i < 70; i++) {
            lista1.add((int) Math.round(Math.random() * 50));
        }
        for (int i = 0; i < 60; i++) {
            lista2.add((int) Math.round(Math.random() * 75));
        }

        for (int j = 0; j < lista1.size(); j++) {
            if (j < lista2.size()) {
                lista3.add(lista1.get(j) * lista2.get(j));
            }else {
                System.out.println("Tamanho de lista diferentes:");
                break;
            }
        }
        System.out.println(lista1);
        System.out.println(lista2);
        System.out.println(lista3);
        System.out.println(lista3.size());
    }
}