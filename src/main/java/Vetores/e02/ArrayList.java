package Vetores.e02;

import java.util.List;
import java.util.Random;

public class ArrayList {
    public static void main(String[] args) {
        List<Integer> lista = new java.util.ArrayList<>();
        List<Integer> lista1 = new java.util.ArrayList<>();
        for(int i = 0; i <= 15; i++){
            lista.add(new Random().nextInt(30));
        }
        for(Integer i : lista){
            lista1.add(i * i);
        }
        System.out.println(lista);
        System.out.println(lista1);

    }
}
