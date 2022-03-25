package ArrayList.e06;

import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.*;

public class e06 {
    public static void main(String[] args) {

        String texto = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum" +
                "has been the industry's standard dummy text ever since the 1500s, when an unknown" +
                "printer took a galley of type and scrambled it to make a type specimen book. It has survived" +
                "not only five centuries, but also the leap into electronic typesetting, remaining essentially" +
                "unchanged. It was popularised in the 1960s with the release of Letraset sheets containing";

        List<String> lista = new  ArrayList<>();

        String[] texto1 = texto.split(" "); /* Split retorna um vetor de String colocando cada palavra um um
                                                     indice usando o espaço " " como separador*/
        List<String> texto3 = new ArrayList<>();

        lista = Arrays.asList(texto1); // Atribui as posições do vetor texto1 a cada posição da lista
        System.out.println(lista);

        int contA = 0;
        int contb = 0;

        for (String x : lista) {
            contb++;       // Contador de palvras
            if (x.toLowerCase().contains("a")) {
                contA++;  // contador palavras com a letra a.
            } else if (x.length() > 5) { // Compara se a palavra tem mais de 5 letras contando o espaço
                texto3.add(x);
            }
        }


        System.out.println(contA);
        System.out.println(contb);
        System.out.println(texto3);


    }
}
