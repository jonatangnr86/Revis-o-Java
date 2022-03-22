package IfElse.e05;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double media = 0;
        boolean vld = false;

        while(!vld){
        for (int x = 0; x < 4; x++) {
            System.out.println("Informa a " + (x + 1) + "° nota:");
            float nota = scan.nextFloat();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota Inválida");
                System.exit(0);
            } else {
                media = media + (nota / 4);
                vld = true;
            }
        }
    }
        if(media == 10){
            System.out.println("Aprovado com distinção");
        }
      if (media > 7 ){
          System.out.println("Aprovado com média " + media);
      }else {
          System.out.println("Reprovado com média " + media);
      }
    }
}
