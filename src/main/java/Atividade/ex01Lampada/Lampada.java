package Atividade.ex01Lampada;

import javax.swing.*;

public class Lampada {

    private String status;

    public Integer realizarLeituraInteger(String msg) {
        while (true) {
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(msg));
            } catch (NumberFormatException nfe0) {
                JOptionPane.showMessageDialog(null, "Número Inválido!");
            }
        }
    }

 public  void ligar(){
    this.setStatus("Lampada Ligada");
     JOptionPane.showMessageDialog(null, this.getStatus());
     System.exit(0);
 }

 public  void desliga (){
     this.setStatus("Lampada Desligada");
     JOptionPane.showMessageDialog(null, this.getStatus());
     System.exit(0);
 }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
