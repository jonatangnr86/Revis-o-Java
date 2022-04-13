package OrientcaoObjetos.Carro;

import javax.swing.*;

public class TesteCarro02 {
    public static void main(String[] args) {
        Carro carro1 = new Carro(Leitura.realizarLeitura("Informe Placa"));

        Carro carro2 = new Carro(Leitura.realizarLeitura("Informe Placa"));



        if(carro1.equals(carro2)){
            JOptionPane.showMessageDialog(null, "Placas iguais");
        } else{
            JOptionPane.showMessageDialog(null, "Placas diferentes");
        }

    }
}
