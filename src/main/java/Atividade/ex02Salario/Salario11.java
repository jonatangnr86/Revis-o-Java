package Atividade.ex02Salario;

public class Salario11 {

    private double salarioReajustado;

    public double salarioReajustado() {
        return salarioReajustado;
    }

    public void salarioReajustado(double salario) {
        this.salarioReajustado = salario;
    }

    public Salario11(double salarioReajustado) {
        this.salarioReajustado = salarioReajustado;
    }

    @Override
    public String toString() {
        return "Salario Reajustado{" +
                 salarioReajustado +
                '}';
    }
}
