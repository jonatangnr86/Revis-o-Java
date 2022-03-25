package ArrayList.e10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Temperatura121Dias {
    public static void main(String[] args) {
        List<Integer> temp = new ArrayList<>();
        Integer media = 0;
        Integer maior = 0;
        Integer menor = 0;
        for (int i = 0; i < 121; i++) {
            temp.add(new Random().nextInt((40 - 15) + 1) + 15);
            media = media + temp.get(i);
        }
        System.out.println(temp);
        media = media / (temp.size());
        Collections.sort(temp); // Ordena a lista
        maior = temp.get(temp.size() - 1); //Ultimo valor da lista
        menor = temp.get(1); // Primeiro valor da lista
        System.out.println(temp);
        System.out.println("Menor temperatura " + menor + "°C");
        System.out.println("Maior temperatura " + maior + "°C");
        System.out.println("Media de temperatura " + media + "°C");
    }
}
