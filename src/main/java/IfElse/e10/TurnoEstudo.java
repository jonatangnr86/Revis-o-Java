package IfElse.e10;

import java.util.Locale;
import java.util.Scanner;

public class TurnoEstudo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String periodo = "mvn";
        String turno;
        boolean vld = false;
        while (!vld) {
            System.out.println("Em qual turno você estuda?");
            System.out.println("M - Matutino\nV - Vespertino\nN - Noturno");
            turno = scan.nextLine();
            if (periodo.contains(turno.toLowerCase())) {
                if (turno.equalsIgnoreCase("M")) {
                    System.out.println("Bom dia");
                } else if (turno.equalsIgnoreCase("V")) {
                    System.out.println("Boa Tarde");
                } else if (turno.equalsIgnoreCase("N")) {
                    System.out.println("Boa noite");
                }
                vld = true;
            } else {
                System.out.println("Turno inválido");
            }
        }
    }
}
