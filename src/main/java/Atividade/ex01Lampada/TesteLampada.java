package Atividade.ex01Lampada;

import javax.swing.*;
import java.util.Scanner;

public class TesteLampada {
    public static void main(String[] args) {

        boolean sts = true;
        Lampada lampada = new Lampada();

        Scanner scan = new Scanner(System.in);

       while(sts) {
           int x = lampada.realizarLeituraInteger("Escolha:\n1 - Ligar\n2 - Desligar");

           if (x == 1){
               lampada.ligar();
               sts = false;
           }else if(x == 2) {
               lampada.desliga();
               sts = false;
           } else {
               JOptionPane.showMessageDialog(null, "Opção inválida!");
           }

       }
    }
}
