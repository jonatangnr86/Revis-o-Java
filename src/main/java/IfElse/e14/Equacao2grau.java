package IfElse.e14;

import java.util.Scanner;

public class Equacao2grau {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor de a:");
        int a = scan.nextInt();

        if(a == 0){
            System.out.println("Não é uma equação de 2° Grau!");
            System.exit(0);
        } else{
            System.out.println("Informe o valor de B:");
            int b = scan.nextInt();

            System.out.println("Informe o valor de C:");
            int c = scan.nextInt();

            double delta = (b * b) - (4 * a * c); // Formula de delta
            double raiz = Math.abs(delta); // Calcula a raiz quadrada de delta

            if(delta > 0){
              int  x1 = (int) (( -b + raiz)) / ( 2*a );
              int  x2 = (int) (( -b - raiz)) / ( 2*a );

                System.out.println("O valor de x1 e: "+ x1);
                System.out.println("O valor de x2 e: "+ x2);

            } else if (delta < 0) {
                System.out.println("A equação não possui raizes reais.");
            }
        }
    }
}
