package ArrayList.e02;

import java.util.ArrayList;
import java.util.List;

public class exc02 {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        List<Integer> lista3 = new ArrayList<>();

        for(int i = 0; i <= 100; i++){
            lista1.add((int) Math.round(Math.random()*5));
            }
        for(Integer x : lista1){
            if(x % 2 == 0){
                lista2.add(x);
            }else {
                lista3.add(x);
            }
        }
        System.out.println(lista1);
        System.out.println("Lista par: " + lista2);
        System.out.println("Lista impar: " + lista3);
    }
}
