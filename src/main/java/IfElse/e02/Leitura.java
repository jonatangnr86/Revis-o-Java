package IfElse.e02;

import javax.swing.*;

public class Leitura {

    public  static Integer realizaLeitura(String msg){
        while(true){
            try{
                return  Integer.parseInt(JOptionPane.showInputDialog(msg));
            }catch (NumberFormatException nfe){ //Tratativa de erros
                msg = msg + "Number Invalido";
            }
        }
    }
}
