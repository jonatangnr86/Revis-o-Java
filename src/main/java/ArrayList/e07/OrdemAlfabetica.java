package ArrayList.e07;

import java.util.*;

public class OrdemAlfabetica {
    public static void main(String[] args) {

        String texto = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum" +
                "has been the industry's standard dummy text ever since the 1500s, when an unknown" +
                "printer took a galley of type and scrambled it to make a type specimen book. It has survived" +
                "not only five centuries, but also the leap into electronic typesetting, remaining essentially" +
                "unchanged. It was popularised in the 1960s with the release of Letraset sheets containing";


        String[] texto1 = texto.split(" "); /* Split retorna um vetor de String colocando cada palavra um um
                                                     indice usando o espaço " " como separador*/

        List<String> lista = new ArrayList<>();
        List<String> listamini = new ArrayList<>();

        lista = Arrays.asList(texto1); // Atribui as posições do vetor texto1 a cada posição da lista

        for (String x : lista) {
         listamini.add(x.toLowerCase()); // Converte todas para minusculas
        }

        Collections.sort(listamini); // Ordena a lista em ordem alfabetica

        for (String i : listamini) {
            System.out.println(i);
        }
    }
}
