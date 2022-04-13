package Heranca.Humano;

public class Municipio {
    private  int codigoMunicipio;
    private String nomeMunicipio;
    private Estado estado;

    public Municipio(int codigoMunicipio, String nomeMunicipio, Estado estado) {
        this.codigoMunicipio = codigoMunicipio;
        this.nomeMunicipio = nomeMunicipio;
        this.estado = estado;
    }

    public int getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setCodigoMunicipio(int codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    public String getNomeMunicipio() {
        return nomeMunicipio;
    }

    public void setNomeMunicipio(String nomeMunicipio) {
        this.nomeMunicipio = nomeMunicipio;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
