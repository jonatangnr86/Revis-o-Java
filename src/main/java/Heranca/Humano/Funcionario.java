package Heranca.Humano;

import java.util.Date;

public class Funcionario extends SerHumanoSC { // Herda atributos da classe SerHumanosSC

    private Integer matriculaFuncionario;
    private String cargo;
    private String horario;
    private Date dataAdmissao;
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Integer getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario(Integer matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
