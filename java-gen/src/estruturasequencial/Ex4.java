package estruturasequencial;

import java.util.Scanner;

public class Ex4 {

    /* 4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
          calcule a seguinte expressão:
                                           D = R + S              R = (A + B)²
                                                 2      , onde    S = (B + C)²
     */

    public static void main(String[] args){

        double A, B, C, R, S, D;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um valor positivo para A:");
        A = ler.nextFloat();

        System.out.println("Informe um valor positivo para B:");
        B = ler.nextFloat();

        System.out.println("Informe um valor positivo para C:");
        C = ler.nextFloat();

        System.out.println("Informe um valor positivo para R:");
        R = ler.nextFloat();

        System.out.println("Informe um valor positivo para S:");
        S = ler.nextFloat();

        System.out.println("Informe um valor positivo para D:");
        D = ler.nextFloat();

        R = Math.pow((A+B), 2);
        S = Math.pow((B+C), 2);
        D = (R+S) / 2;

        System.out.println("Portanto, \n o valor de R é: " + R + ". \n o valor de S é: " + S + ". \n o valor de D é: " + D + ".");

    }
}
