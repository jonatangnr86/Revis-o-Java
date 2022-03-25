package ArrayList.e11;

import java.util.Scanner;

public class FatoresPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int a = sc.nextInt();
       // int b = sc.nextInt();
        // for (int i = a; i <= b; i++) {


        System.out.print(a + "=");
        num = a;
        for (int j = 2; j <= a / 2; j++) {


            while (num % j == 0) {


                num = num / j;
                System.out.print(j);
                if (num != 1)
                    System.out.print("*");
            }
        }
        if (num == a) {


            System.out.print(a);
        }
        System.out.println();
    }
}


