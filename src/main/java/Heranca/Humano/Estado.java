package Heranca.Humano;

public class Estado {
    private int codigoEstado;
    private String nomeEstado;
    private String siglaEstado;

    public Estado(int codigoEstado, String nomeEstado, String siglaEstado) {
        this.codigoEstado = codigoEstado;
        this.nomeEstado = nomeEstado;
        this.siglaEstado = siglaEstado;
    }

    public Integer getCodigoEstado() {
        return codigoEstado;
    }

    public void setCodigoEstado(Integer codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public String getSiglaEstado() {
        return siglaEstado;
    }

    public void setSiglaEstado(String siglaEstado) {
        this.siglaEstado = siglaEstado;
    }

}
