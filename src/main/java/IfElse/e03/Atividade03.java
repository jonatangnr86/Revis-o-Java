package IfElse.e03;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        String f = "";

        Scanner scan = new Scanner(System.in);

        while(!f.equalsIgnoreCase("f") && !f.equalsIgnoreCase("m")){
            System.out.println("Informe o sexo: F ou M");
            f = scan.nextLine();
             // equalsIgnoreCase verifica string maiuscula e minuscula.
            if (f.equalsIgnoreCase("F")){
                System.out.println("Você informou sexo feminino");
            } else if(f.equalsIgnoreCase("M")){
                System.out.println("Você informou sexo masculino");
            } else {
                System.out.println("Formato inválido");
            }
        }
    }
}
