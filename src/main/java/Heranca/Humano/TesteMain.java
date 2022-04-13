package Heranca.Humano;

public class TesteMain {
    public static void main(String[] args) {

        Professor p = new Professor();
        Aluno a = new Aluno();
       Funcionario f = new Funcionario();

        p.getEndereco().getMunicipio().getEstado().getNomeEstado();
        a.getEndereco().getMunicipio().getEstado().getNomeEstado();
        f.getEndereco().getMunicipio().getEstado().getNomeEstado();

    }
}
