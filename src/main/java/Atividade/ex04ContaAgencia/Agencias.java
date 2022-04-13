package Atividade.ex04ContaAgencia;

import java.util.Objects;

public class Agencias {

    private Banco numBanco;
    private String numeroAgencia;

    public Banco getNumBanco() {
        return numBanco;
    }

    public void setNumBanco(Banco numBanco) {
        this.numBanco = numBanco;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Agencias)) return false;
        Agencias agencias = (Agencias) o;
        return numBanco.equals(agencias.numBanco) && numeroAgencia.equals(agencias.numeroAgencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numBanco, numeroAgencia);
    }
}
