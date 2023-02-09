package lacoscondicionais;

import java.util.Scanner;

public class Ex2 {

    // 2. Faça um programa que entre com três números e coloque em ordem crescente.

    public static void main(String[] args) {

        int n1, n2, n3;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valor:");
        n1 = entrada.nextInt();

        System.out.println("Informe outro valor:");
        n2 = entrada.nextInt();

        System.out.println("Informe mais um valor:");
        n3 = entrada.nextInt();

        if (n1 < n2) {
            if (n2 < n3) {
                System.out.println("Cê digitou em ordem crescente, hein!");
            } else if (n1 < n3) {
                System.out.println(n1 + " é o menor valor, " + n3 + " é o segundo e " + n2 + " o ultimo.");
            } else {
                System.out.println(n3 + " é o menor valor, " + n1 + " é o próximo e " + n2 + " o último.");
            }
        } else if (n2 < n3) {
            if (n1 < n2) {
                System.out.println(n2 + " é o menor valor, " + n1 + " é o próximo e " + n3 + " o último.");
            } else {
                System.out.println(n2 + " é o menor valor, " + n3 + " é o próximo e " + n1 + " o último.");
            }
        } else {
            System.out.println("Cê digitou em ordem decrescente, hein!");
        }
    }
}