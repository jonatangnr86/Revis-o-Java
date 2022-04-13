package OrientcaoObjetos.Carro;
import javax.swing.*;
import java.util.Objects;

public class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private double quilometrosRodado;

    public Carro (String placa){
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(this.marca == null) {
            this.marca = marca;
        }else{
            JOptionPane.showMessageDialog(null,
                    "Marca não pode ser alterada");
        }
    }

    public String getModelo() {
        if(this.modelo == null){
            setModelo(Leitura.realizarLeitura(
                    "Informe o modelo"));
        }
        return modelo;
    }
    public void setModelo(String modelo) {
        if(this.modelo== null){
            this.modelo = modelo;
        }else if(this.modelo.length() < 2){
            JOptionPane.showMessageDialog(null,
                    "Modelo deve possui > 2 ");
        } else{
            JOptionPane.showMessageDialog(null,
                    "Modelo não informado");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(this.ano == 0){
            this.ano = ano;
        }else{
            JOptionPane.showMessageDialog(null,
                    "Modelo já informado");
        }
    }

    public double getQuilometrosRodado() {
        return quilometrosRodado;
    }

    public void andar(double km){
        this.quilometrosRodado = this.quilometrosRodado +km;
    }

    public void andar(int km){
        this.quilometrosRodado = this.quilometrosRodado +km;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override  //
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carro)) return false;
        Carro carro = (Carro) o;
        return placa.equals(carro.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa);
    }
}