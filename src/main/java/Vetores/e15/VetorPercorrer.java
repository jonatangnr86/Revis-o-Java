package Vetores.e15;

public class VetorPercorrer {
    public static void main(String[] args) {
        int[] vetor1 = new int[10];
        int quinze = 0, soma = 0, soma2 = 0, qdt = 0;
        double media = 0;

        for (int x = 0; x < vetor1.length; x++) {
            vetor1[x] = x * 5;
            System.out.println(vetor1[x]);
            if(vetor1[x] > 15) {
                soma2 = soma2 + vetor1[x];    // recebe > 15
                qdt = qdt + 1;                // recebe a quantidade de números > 15
            }else if (vetor1[x] < 15){
                soma = soma + vetor1[x];      // recebe a soma de < 15
            }
            else {
                quinze = quinze + 1;          // recebe a quantidade de números 15 no vetor
            }
        }
        media = soma2 / qdt;                  // calcula a media de números > 15
        System.out.println("A soma dos elementos menores de 15 é: " + soma);
        System.out.println("Aquantidade de elementos igual a 15 é: " + quinze);
        System.out.println("A média dos elementos maiores de 15 é: " + media );
    }
}
