package OrientcaoObjetos.CaixaEletronico;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class funcoesCaixa {

    private Date data = new Date();
    List<String> extrato = new ArrayList<>();
    private double saldo;
    private double valorSaque;
    private double valorDep;

    public static String realizarLeitura(String msg) { //Classe statica não precisa criar objeto para chamar

        return JOptionPane.showInputDialog(msg);
    }

    public  Integer realizarLeituraInteger(String msg) {
        while (true) {
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(msg));
            } catch (NumberFormatException nfe0) {
                JOptionPane.showMessageDialog(null, "Número Inválido!");
            }
        }
    }
    public  double realizarLeituraDouble(String msg) {
        while (true) {
            try {
                return Double.parseDouble(JOptionPane.showInputDialog(msg));
            } catch (NumberFormatException nfe0) {
                JOptionPane.showMessageDialog(null, "Número Inválido!");
            }
        }
    }

    public void sacar() {
        if (getValorSaque() <= 0) {
            JOptionPane.showMessageDialog(null, "Valor Inválido");
        } else if (getValorSaque() < getSaldo()) {
            setSaldo(getSaldo() - getValorSaque());
            extrato.add(this.data +" Saque de R$" + getValorSaque() + "\n");
            JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso");
        } else if (getValorSaque() > getSaldo()) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        }
    }

    public void depositar() {
        if (this.valorDep > 0) {
            setSaldo(this.saldo + this.getValorDep());
            JOptionPane.showMessageDialog(null, "Depósito efetuato com Sucesso!");
            extrato.add(this.data + " Depósito de " + this.getValorDep()+ "\n");
        } else {
            JOptionPane.showMessageDialog(null, "Valor inválido!");
        }
    }

    public void extrats(){

            JOptionPane.showMessageDialog(null, extrato);

    }

    public String saldo() {
        return "Saldo R$ " + this.getSaldo();
    }

    public void extra() {
        for (String x : extrato) {
            System.out.println(x);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public double getValorSaque() {
        return valorSaque;
    }

    public void setValorSaque(double valor) {
        this.valorSaque = valor;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;

    }

    public double getValorDep() {
        return valorDep;
    }

    public void setValorDep(double valorDep) {
        this.valorDep = valorDep;
    }

    public funcoesCaixa(double saldo) {
        this.saldo = saldo;
        this.valorSaque = valorSaque;
        this.valorDep = valorDep;
        this.data = data;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
