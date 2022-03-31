package ArrayList.e17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdemAlfabetica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        boolean vld = false;
        while(!vld){
            System.out.println("Quantos nomes dejesa informar: ");
            int number = scan.nextInt();
            if(number > 0){
                for(int i = 0; i < number; i++){
                    System.out.println("Informe o " + (i +1) + "° nome:");
                    nomes.add(scan.next());
                }
                vld = true;
            } else {
                System.out.println("Número deve ser > 0");
            }
        }
        Collections.sort(nomes);
        System.out.println("Lista em ordem alfabética:");
        System.out.print(nomes);
    }
}
