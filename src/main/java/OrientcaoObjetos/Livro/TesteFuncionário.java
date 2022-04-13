package OrientcaoObjetos.Livro;

import Atividade.ex02Salario.Funcionario;
import Atividade.ex02Salario.Salario11;
import Atividade.ex02Salario.SalarioAtual;

import javax.swing.*;

public class TesteFuncionário {
    public static void main(String[] args) {
        Funcionario funcao = new Funcionario();
        funcao.setNome(funcao.realizarLeitura("Iforme nome:"));
        funcao.setCpf(funcao.realizarLeituraInteger("Informe CPF:"));

        double sAtuaL = funcao.realizarLeituraDouble("Informe salário atual:");

        // Chama o construtor da classe passando valor do salário
        funcao.setSalarioAtual(new SalarioAtual(sAtuaL));

        double sReajuste = funcao.calReajuste(sAtuaL);

        //Chama construtor da classe passando a funcao calReajuste
        funcao.setSalarioReajustado(new Salario11(sReajuste));

        JOptionPane.showMessageDialog(null,funcao);
    }
}
