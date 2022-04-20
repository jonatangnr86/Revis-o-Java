package Heranca.Editora;

import Heranca.Humano.SerHumanoSC;

import java.util.ArrayList;
import java.util.List;

public class TesteEditora {
    public static void main(String[] args) {


        List<LivroSC> listaLivros = new ArrayList<>();
        listaLivros.add(new LivroDigital("Marca d'agua"));
        listaLivros.add(new LivroImpresso(5.00));

        for (LivroSC s : listaLivros) {
            System.out.print(s.getClass());
            if (s.validaLivro()) {  // Se houver uma matricula valida retorna true
                System.out.println(" Válido ");
            } else {                 // Se não houver uma matricula valida retorna false
                System.out.println(" Iválido");
            }
        }
     }
}
