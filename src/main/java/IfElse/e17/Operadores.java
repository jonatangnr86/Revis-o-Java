package IfElse.e17;

public class Operadores {

    private double adicao;
    private double subtrai;
    private double multiplica;
    private double divide;

    public void adicao(double valor1, double valor2){
        setAdicao(valor1 + valor2);

        System.out.println("Resultado da Adição: " + getAdicao());

        if(getAdicao() % 2 == 0){
            System.out.print("O resultado é um número Par");
        } else {
            System.out.print("O resultado é um número Impar");
        }
        if(getAdicao() > 0){
            System.out.print(" e Positivo.");
        } else {
            System.out.print(" e negativo.");
        }
    }

    public void subtrai(double valor1, double valor2){
        setSubtrai(valor1 - valor2);
        System.out.println("O resultado da subtração é: " + getSubtrai());

        if(getSubtrai() % 2 == 0){
            System.out.print("O resultado é um número Par");
        } else {
            System.out.print("O resultado é um número Impar");
        }
        if(getSubtrai() > 0){
            System.out.print(" e Positivo.");
        } else {
            System.out.print(" e negativo.");
        }
    }

    public void multiplica(double valor1, double valor2){
        setMultiplica(valor1 * valor2);
        System.out.println("O resultado da multiplicação é: " + getMultiplica());

        if(getMultiplica() % 2 == 0){
            System.out.print("O resultado é um número Par");
        } else {
            System.out.print("O resultado é um número Impar");
        }
        if(getMultiplica() > 0){
            System.out.print(" e Positivo.");
        } else {
            System.out.print(" e negativo.");
        }
    }

    public void divide(double valor1, double valor2){
        setDivide(valor1 - valor2);
        System.out.print("O resultado da subtração é: " + getDivide());

        if(getDivide() % 2 == 0){
            System.out.print("O resultado é um número Par");
        } else {
            System.out.print("O resultado é um número Impar");
        }
        if(getDivide() > 0){
            System.out.print(" e Positivo.");
        } else {
            System.out.print(" e negativo.");
        }
    }

    public double getAdicao() {
        return adicao;
    }

    public void setAdicao(double adicao) {
        this.adicao = adicao;
    }

    public double getSubtrai() {
        return subtrai;
    }

    public void setSubtrai(double subtrai) {
        this.subtrai = subtrai;
    }

    public double getMultiplica() {
        return multiplica;
    }

    public void setMultiplica(double multiplica) {
        this.multiplica = multiplica;
    }

    public double getDivide() {
        return divide;
    }

    public void setDivide(double divide) {
        this.divide = divide;
    }
}
