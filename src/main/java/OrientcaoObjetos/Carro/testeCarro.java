package OrientcaoObjetos.Carro;

import java.util.ArrayList;
import java.util.List;

public class testeCarro {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>(); // Cria uma Lista de carros da classe Carro
        boolean sair = true;

        while (sair) {
            Carro carro = new Carro();

            carro.ano = Leitura.realizarLeituraInteger("Informe o ano");
            carro.kmRodados = Leitura.realizarLeituraInteger("Informe os Km rodados");
            carro.modelo = Leitura.realizarLeitura("Informe a modelo:");
            carro.marca = Leitura.realizarLeitura("Informe a marca");
            String strSair = Leitura.realizarLeitura("Deseja informar mais Carros");

            carros.add(carro); // Lista recebe carro

            if (strSair.equalsIgnoreCase("N")) {
                sair = false;
            }
        }
        for (Carro x : carros) {
            System.out.println();
        }

       /* System.out.println("Marca " + carro.modelo);
        System.out.println("Marca " + carro.marca);
        System.out.println("Marca " + carro.ano);
        System.out.println("Marca " + carro.kmRodados);*/

    }
}
