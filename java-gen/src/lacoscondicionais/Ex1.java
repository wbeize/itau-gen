package lacoscondicionais;

import java.util.Scanner;

public class Ex1 {

    // 1. Faça um programa que receba três inteiros e diga qual deles é o maior.

    public static void main(String[] args) {

        int n1, n2, n3;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valor:");
        n1 = entrada.nextInt();

        System.out.println("Informe outro valor:");
        n2 = entrada.nextInt();

        System.out.println("Informe mais um valor:");
        n3 = entrada.nextInt();

        if(n1 > n2 && n1 > n3) {
            System.out.println("O primeiro valor: " + n1 + "é o maior dos três!");
        }

        else if(n3 < n2) {
            System.out.println("O segundo valor: "+ n2 + "é o maior entre os três!");
        }

        else {
            System.out.println("O terceiro valor: " + n3 + ", é o maior entre os três!");
        }
    }
}
