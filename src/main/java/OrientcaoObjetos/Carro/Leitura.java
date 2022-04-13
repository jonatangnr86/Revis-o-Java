package OrientcaoObjetos.Carro;

import javax.swing.*;

public class Leitura {

    public static String realizarLeitura(String msg) { //Classe statica não precisa criar objeto para chamar
        return JOptionPane.showInputDialog(msg);
    }

    public static double realizarLeituraDouble(String msg){
        while (true) {
            try {
                return Double.parseDouble(JOptionPane.showInputDialog(msg));
            } catch (NumberFormatException nfe0) {
                msg = msg + "Number Inválido";
            }
        }

    }
    public static Integer realizarLeituraInteger(String msg) {
        while (true) {
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(msg));
            } catch (NumberFormatException nfe0) {
                msg = msg + "Number Inválido";
            }
        }
    }
}
