package Atividade.ex02Salario;

import Atividade.ex02Salario.Salario11;
import Atividade.ex02Salario.SalarioAtual;

import javax.swing.*;

public class Funcionario {
    private String nome;
    private Integer cpf;
    private SalarioAtual salarioAtual;
    private Salario11 salarioReajustado;

    public String realizarLeitura(String msg) { //Classe statica não precisa criar objeto para chamar
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

    public double calReajuste(double x){
       x = x + (x * 0.11);
        return x;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public SalarioAtual getSalarioAtual() {
        return salarioAtual;
    }

    public void setSalarioAtual(SalarioAtual salarioAtual) {
        this.salarioAtual = salarioAtual;
    }

    public Salario11 getSalarioReajustado() {
        return salarioReajustado;
    }

    public void setSalarioReajustado(Salario11 salarioReajustado) {
        this.salarioReajustado = salarioReajustado;
    }

    @Override
    public String toString() {
        return "Funcionario{" + nome + '\'' +
                "\nCPF" + cpf + '\'' +
                "\n" + salarioAtual +
                "\n" + salarioReajustado +
                '}';
    }
}
