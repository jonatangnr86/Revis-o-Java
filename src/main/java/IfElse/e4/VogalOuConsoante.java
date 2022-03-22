package IfElse.e4;

import java.util.Locale;
import java.util.Scanner;

public class VogalOuConsoante {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = scan.nextLine();

        if (letra.equalsIgnoreCase("a")
            || letra.equalsIgnoreCase("e")
            || letra.equalsIgnoreCase("i")
            || letra.equalsIgnoreCase("o")
            || letra.equalsIgnoreCase("u")){

            System.out.println("Você digitou uma vogal");
        }else {

            System.out.println("Você digitou uma consoante");
        }

        // "indexOf" verifica se letra digitada esta dentro da string retornando a posição se não encontrar retorna -1
        // "contains" verifica se a letra esta dentro da string retornando true ou false
        // "toLowerCase" torna as letras todas minusculas

        String vogais = "aeiou";

        if(vogais.contains(letra.toLowerCase())){
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }
        System.out.println(vogais.indexOf(letra.toLowerCase()));
    }
}
