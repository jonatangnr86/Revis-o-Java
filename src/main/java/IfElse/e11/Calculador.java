package IfElse.e11;

public class Calculador {

    private double salarioComAumento;

    double vinte(double valor){
        setSalarioComAumento((valor * 0.2) + valor);
        return getSalarioComAumento();
    }

    double quinze(double valor){
        setSalarioComAumento((valor * 0.15) + valor);
        return getSalarioComAumento();
    }

    double dez(double valor){
        setSalarioComAumento((valor * 0.1) + valor);
        return getSalarioComAumento();
    }

    double cinco(double valor){
        setSalarioComAumento((valor * 0.05) + valor);
        return getSalarioComAumento();
    }

    public double getSalarioComAumento() {
        return salarioComAumento;
    }

    public void setSalarioComAumento(double salarioComAumento) {
        this.salarioComAumento = salarioComAumento;
    }
}
