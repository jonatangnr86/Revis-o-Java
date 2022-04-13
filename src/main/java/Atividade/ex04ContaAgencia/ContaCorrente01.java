package Atividade.ex04ContaAgencia;


import javax.swing.*;
import java.util.Objects;

public class ContaCorrente01 {

    private Agencias numAgencia;
    private Integer numeroConta;
    private double saldo;
    private double limiteConta;
    private double vlrlimite;
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
        if (getVlrlimite() >= getLimiteConta()) {
            JOptionPane.showMessageDialog(null, "Saldo R$ " + this.getSaldo() +
                    "\nLimite Cheque especial R$ " + this.getVlrlimite());
        } else {
            JOptionPane.showMessageDialog(null, "Saldo R$ " + this.getSaldo() +
                    "\nLimite Cheque especial R$ " + this.getVlrlimite() +
                    "\nCheque especial em uso R$ " + (getLimiteConta() - getVlrlimite()));
        }
    }

    public void deposito(double valor) {
        if (this.getVlrlimite() < this.getLimiteConta()) {
            double x = this.getLimiteConta() - this.getVlrlimite(); // Calcula valor a devolver no limite
            setVlrlimite(this.getVlrlimite() + x); // recebe valor pra fechar o limite
            setSaldo(valor - x);
        } else {
            this.setSaldo(this.getSaldo() + valor);
        }
    }

    public void sacar(double valor) {

        double saldoTotal = this.getSaldo() + this.getVlrlimite();

        if (valor > saldoTotal) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
        } else if (valor <= 0) {
            JOptionPane.showMessageDialog(null, "Valor Inválido");
        } else if (valor < saldoTotal && getVlrlimite() > 0) {
            this.setSaldo(this.getSaldo() - valor);
            if (getSaldo() < 0) {
                setVlrlimite(getVlrlimite() + (getSaldo()));
            }
        } else {
            saldoTotal = saldoTotal - valor;
            this.setSaldo(0);
            this.setVlrlimite(saldoTotal);
        }
    }

    public Agencias getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(Agencias numAgencia) {
        this.numAgencia = numAgencia;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getVlrlimite() {
        return vlrlimite;
    }

    public void setVlrlimite(double vlrlimite) {
        this.vlrlimite = vlrlimite;
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

    public ContaCorrente01(Integer numeroConta, double saldo, double limiteConta, boolean status) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.limiteConta = limiteConta;
        this.status = status;
    }

    @Override
    public String toString() {
        return "ContaCorrente01{" +
                "numAgencia=" + numAgencia +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                ", limiteConta=" + limiteConta +
                ", vlrlimite=" + vlrlimite +
                ", status=" + status +
                '}';
    }
}
