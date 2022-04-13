package Atividade.ex03ContaCorrente;

import javax.swing.*;

public class TesteConta {
    public static void main(String[] args) {
        boolean std = true;
        ContaCorrente conta = new ContaCorrente(1234,"Diogo", 1000, true);

        if(conta.isStatus()){
            conta.setLimiteConta(1000);
            conta.setLimite(conta.getLimiteConta());
        }

        while(std){
            int f = conta.realizarLeituraInteger("Escolha uma opçao:\n" +
                    "1- Saldo\n" +
                    "2- Saque\n3- Depósito\n" +
                    "4- Sair");

            if(f == 1){
                conta.saldo();
            }else if(f == 2){
                conta.sacar(conta.realizarLeituraDouble("Informe valor do saque: "));
            } else if(f == 3){
                conta.deposito(conta.realizarLeituraDouble("Informe valor do depósito"));
            } else if(f == 4){
                std = false;
            } else {
                JOptionPane.showMessageDialog(null, "Opção Inválida!");
            }

        }
        System.exit(0);
    }
}
