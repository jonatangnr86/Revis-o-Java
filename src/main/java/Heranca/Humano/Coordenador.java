package Heranca.Humano;

import javax.print.DocFlavor;

public class Coordenador extends  SerHumanoSC {

    private Integer matriculaCooordenador;
    private String cursoCoordenado;

    public int getCodCooordenador() {
        return matriculaCooordenador;
    }

    public void setCodCooordenador(int codCooordenador) {
        this.matriculaCooordenador = codCooordenador;
    }

    public String getCursoCoordenado() {
        return cursoCoordenado;
    }

    public void setCursoCoordenado(String cursoCoordenado) {
        this.cursoCoordenado = cursoCoordenado;
    }


    @Override  // Metodo valida matricula
    public boolean ValidaCodigo() {
        if(this.matriculaCooordenador == null){
            return false;
        }else {
            return true;
        }
    }
}


