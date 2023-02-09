package lacoscondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex4 {

    /* 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
          número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
          ímpar exiba o número elevado ao quadrado. */

    public static void main(String[] args) {

        float numero;
        DecimalFormat decimal = new DecimalFormat("0.00");
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com um numero: ");
        numero = entrada.nextFloat();

        if(numero % 2 == 0) {
            System.out.println("Voce digitou um numero par e a raiz quadrada dele é: " + Math.sqrt(numero));
        } else {
            System.out.println("Voce digitou um numero ímpar e ele elevado ao quadrado vai dar: "
                    + decimal.format(Math.pow(numero, 2)));
        }
    }
}
