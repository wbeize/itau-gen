package estruturasequencial;

import java.util.Scanner;

public class Ex7 {

    /* 7. Um sistema de equações lineares do tipo: ax + by = c e dx + ey = f,
          pode ser resolvido segundo mostrado abaixo:
              x = ce - bf           y = af - cd
                  ae - bd               ae - bd
          Escreva um sistema que lê os coeficientes a, b, c, d, e e f e calcula e mostra os valores de x e y. */

    public static void main(String[] args){

        float A, B, C, D, E, F, X, Y;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor de A: ");
        A = ler.nextFloat();

        System.out.println("Informe o valor de B: ");
        B = ler.nextFloat();

        System.out.println("Informe o valor de C: ");
        C = ler.nextFloat();

        System.out.println("Informe o valor de D: ");
        D = ler.nextFloat();

        System.out.println("Informe o valor de E: ");
        E = ler.nextFloat();

        System.out.println("Informe o valor de F: ");
        F = ler.nextFloat();

        X = (C * E) - (B * F) / (A * E) - (B * D);
        Y = (A * F) - (C * D) / (A * E) - (B * D);

        System.out.println("\n O valor de X é: " + X + ". \n O valor de Y é: " + Y + ".");

    }
}
