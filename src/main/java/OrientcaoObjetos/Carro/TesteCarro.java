package OrientcaoObjetos.Carro;

import java.util.ArrayList;
import java.util.List;

public class TesteCarro {

    public static void main(String[] args) {
        List<Carro> listaDeCarros = new ArrayList<>();
        boolean sair = true;
        while (sair) {
            Carro carro = new Carro("");
            carro.setMarca(
                    Leitura.realizarLeitura("Marca"));
            carro.setMarca(
                    Leitura.realizarLeitura("Marca"));
            carro.setModelo(
                    Leitura.realizarLeitura("Modelo"));
            carro.setAno(
                    Leitura.realizarLeituraInteger("Ano"));
            carro.andar(
                    Leitura.realizarLeituraInteger("Kms Int"));
            carro.andar(
                    Leitura.realizarLeituraDouble("Kms double"));

            listaDeCarros.add(carro);
            String strSair =
                    Leitura.realizarLeitura("Parar digite sim");
            if("sair".equalsIgnoreCase(strSair)){
                sair = false;
            }
        }
    }
}