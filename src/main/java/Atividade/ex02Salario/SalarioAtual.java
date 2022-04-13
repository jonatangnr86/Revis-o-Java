package Atividade.ex02Salario;

public class SalarioAtual {

    private double salarioAtual;

    public double getSalarioAtual() {
        return salarioAtual;
    }

    public void setSalarioAtual(double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }

    public SalarioAtual(double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }

    @Override
    public String toString() {
        return "SalarioAtual{" +
                 salarioAtual +
                '}';
    }
}
