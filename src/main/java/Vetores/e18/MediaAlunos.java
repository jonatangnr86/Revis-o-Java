package Vetores.e18;

import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nome = new String[10];
        String[] status = new String[10];
        double[] nota1 = new double[10];
        double[] nota2 = new double[10];
        double[] media = new double[10];

        for(int i = 0; i < nome.length; i++){
            System.out.println("Informe o nome do " + (i + 1) +  "° aluno:");
            nome[i] = scan.next();
            System.out.println("Informe a 1° nota: ");
            nota1[i] = scan.nextDouble();
            System.out.println("Informe a 2° nota: ");
            nota2[i] = scan.nextDouble();
            media[i] = (nota1[i] + nota2[i]) / 2;
            if(media[i] > 7){
                status[i] = "Aprovado";
            } else {
                status[i] = "Reprovado";
            }
        }
        for(int j = 0; j < media.length; j++){
            System.out.println("Aluno: " + nome[j] + " " + status[j] + " com média: " + media[j]);

        }


    }
}
