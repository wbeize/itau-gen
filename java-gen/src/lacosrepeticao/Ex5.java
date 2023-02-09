package lacosrepeticao;

import java.util.Scanner;

public class Ex5 {

    /* 5- (DO...WHILE) Crie um programa que leia um número do teclado até que encontre um
          número igual a zero. No final, mostre a soma dos números digitados. */

    public static void main (String[] args) {

        int num, soma = 0;
        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("Fala um número: ");
            num = ler.nextInt();
            soma += num;
        } while (num != 0);
        System.out.println("Somados, todos os números resultam em: " + soma);
    }
}
