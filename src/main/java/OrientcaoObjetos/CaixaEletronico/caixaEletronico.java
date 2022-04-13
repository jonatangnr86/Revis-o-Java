package OrientcaoObjetos.CaixaEletronico;

import javax.swing.*;
import java.util.Scanner;

public class caixaEletronico {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        funcoesCaixa acao = new funcoesCaixa(1000);
        boolean vld = true;

        while (vld) {
            Integer opcao = acao.realizarLeituraInteger(
                    "Escolha uma opçao:\n" +
                            "1- Saldo\n" +
                            "2- Saque\n3- Depósito\n" +
                            "4- extrato\n5- Sair");
            if (opcao == 1) {
                acao.saldo();
            } else if (opcao == 2) {
                acao.setValorSaque(acao.realizarLeituraDouble("Valor do Saque:"));
                acao.sacar();
            } else if (opcao == 3) {
                acao.setValorDep(acao.realizarLeituraDouble("Valor do depoósito:"));
                acao.depositar();
            } else if (opcao == 4) {
                acao.extrats();
            } else if (opcao == 5) {
                vld = false;
            } else {
                JOptionPane.showMessageDialog(null, "Opção Inválida!");
            }
        }
    }
}