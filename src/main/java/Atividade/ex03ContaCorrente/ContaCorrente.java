package Atividade.ex03ContaCorrente;

import javax.swing.*;
import java.util.Objects;

public class ContaCorrente {

    private Integer numeroConta;
    private String titular;
    private double saldo;
    private double limiteConta;
    private double limite;
    private boolean status;

    public String realizarLeitura(String msg) {
        return JOptionPane.showInputDialog(msg);
    }

    public Integer realizarLeituraInteger(String msg) {
        while (true) {
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(msg));
            } catch (NumberFormatException nfe0) {
                JOptionPane.showMessageDialog(null, "Número Inválido!");
            }
        }
    }

    public double realizarLeituraDouble(String msg) {
        while (true) {
            try {
                return Double.parseDouble(JOptionPane.showInputDialog(msg));
            } catch (NumberFormatException nfe0) {
                JOptionPane.showMessageDialog(null, "Número Inválido!");
            }
        }
    }

    public void saldo() {
        if (getLimite() >= getLimiteConta()) {
            JOptionPane.showMessageDialog(null, "Saldo R$ " + this.getSaldo() +
                    "\nLimite Cheque especial R$ " + this.getLimite());
        } else {
            JOptionPane.showMessageDialog(null, "Saldo R$ " + this.getSaldo() +
                    "\nLimite Cheque especial R$ " + this.getLimite() +
                    "Cheque especial em uso R$ " + (getLimiteConta() - getLimite()));
        }
    }

    public void deposito(double valor) {
        if (this.getLimite() < this.getLimiteConta()) {
            double x = this.getLimiteConta() - this.getLimite(); // Calcula valor a devolver no limite
            setLimite(this.getLimite() + x); // recebe valor pra fechar o limite
            setSaldo(valor - x);
        } else {
            this.setSaldo(this.getSaldo() + valor);
        }
    }

    public void sacar(double valor) {

        double saldoTotal = this.getSaldo() + this.getLimite();

        if (valor > saldoTotal) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
        } else if (valor <= 0) {
            JOptionPane.showMessageDialog(null, "Valor Inválido");
        }

        else if (valor < saldoTotal && getLimite() > 0) {
            this.setSaldo(this.getSaldo() - valor);
            if (getSaldo() < 0) {
                setLimite( getLimite() + (getSaldo()));
            }
        } else {
            saldoTotal = saldoTotal - valor;
            this.setSaldo(0);
            this.setLimite(saldoTotal);
        }
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getLimiteConta() {
        return limiteConta;
    }

    public void setLimiteConta(double limiteConta) {
        this.limiteConta = limiteConta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContaCorrente)) return false;
        ContaCorrente that = (ContaCorrente) o;
        return numeroConta.equals(that.numeroConta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroConta);
    }

    public ContaCorrente(Integer numeroConta, String titular, double saldo, boolean status) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.status = status;
    }

}
