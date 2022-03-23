package Vetores.e19;

import java.util.Scanner;

public class CotacaoDolar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] valor = new double[3];
        double cotacao = 0;

        System.out.println("Informe a cotação do Dolar: ");
        cotacao = scan.nextDouble();

        for(int i = 0; i < valor.length; i++){
            valor[i] = cotacao * i;
            System.out.print(valor[i] + ", ");
        }
    }
}
