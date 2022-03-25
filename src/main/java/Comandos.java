import java.util.Arrays;
import java.util.Collections;

public class Comandos {
    public static void main(String[] args) {

        // Collections.sort(lista);  // Ordena a lista em ordem crescente

        //  Arrays.sort(vetor); // coloca o array em ordem crescente.

        //  Math.abs(delta); // Calcula a raiz quadrada de delta

        /*String[] texto1 = texto.split(" "); /* Split retorna um vetor de String colocando cada palavra um um
                                                     indice usando o espaço " " como separador*/

       // A[i] = (int)Math.round(Math.random() * 1); atrihbui valores aleatórios ao vetor

        // Collections.reverse(lista);  inverte a lista

        String letra = "a";
        String vogais = "aeiou";
        if (vogais.contains(letra.toLowerCase())) { /* .contains Verifica se a letra esta na string
                                                     .toLowerCase torna todas as Strings minusculas*/
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }
        System.out.println(vogais.indexOf(letra.toLowerCase()));

    }
}
