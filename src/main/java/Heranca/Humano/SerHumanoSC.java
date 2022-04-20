package Heranca.Humano;

public abstract class SerHumanoSC {
    // abstract torna a classe abstrata todos os metodos da Super Classe devem estar nas SubClasses
    private String nome;
    private String cpf;
    private String rg;
    private Enderecos endereco;

    public abstract boolean ValidaCodigo(); //Obriga todas as classes ter esse metodo.
                                            //Método sem implementação na classe mãe
                                            // E com implemento nas SubClasses

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Enderecos getEndereco() {
        return endereco;
    }

    public void setEndereco(Enderecos endereco) {
        this.endereco = endereco;
    }
}
