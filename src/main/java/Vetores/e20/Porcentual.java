package Vetores.e20;

public class Porcentual {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int cont0 = 0;
        int cont1 = 0;
        double percentual1 = 0;
        double percentual0 = 0;

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) Math.round(Math.random()*1);
            System.out.print(vetor[i] + ", ");
            if(vetor[i] == 1){
                cont1++;
            } else {
                cont0++;
            }
        }
        percentual0 = (cont0 * 100) / vetor.length;
        percentual1 = 100 - percentual0;

        System.out.println("\nNúmeros 1 = " + percentual1 + "%"
                           + "\nNúmeros 0 = " + percentual0 + "%");
    }
}
