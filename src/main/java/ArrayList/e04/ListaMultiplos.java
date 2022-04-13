package ArrayList.e04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaMultiplos {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

    System.out.println("Informe um numero inteiro: ");
    int number = scan.nextInt();

    for(int i = 0; i < 15; i++){
        lista.add(i * number);
    }
        System.out.println(lista);
    }
}
