package IfElse.e03;

import javax.swing.*;

public class Leitura1 {

    public static Integer realizarLeitura(String msg){
        while(true){
            try{
                return  Integer.parseInt(JOptionPane.showInputDialog(msg));
            }catch (NumberFormatException nfe0){
                msg = msg + "Number Inválido";
            }
        }
    }

}
