package ArrayList.e05;

import java.util.ArrayList;
import java.util.List;

public class MenorElemento {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        for(int i = 0; i < 100; i++){
            lista.add((int) Math.round(Math.random()*50));
        }
        int menor = lista.get(0);
        int maior = lista.get(0);

        for(Integer x : lista){
            if(x < menor){
                menor = x;
            } else if (x > maior){
                maior = x;
            }
        }
        System.out.println(lista);
        System.out.println("O menor valor na lista é: " + menor);
        System.out.println("O maior elemento na lista é: " + maior);
    }
}
