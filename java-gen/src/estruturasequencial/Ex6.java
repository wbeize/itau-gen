package estruturasequencial;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex6 {

    /* 6. Construa um programa em c que, tendo como dados de entrada dois pontos
          quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles.
          A fórmula que efetua tal cálculo é: d = √(x2 - x1)² + (y2 - y1)²
     */

    public static void main(String[] args){

        double x1, x2, y1, y2, distancia, raiz;
        DecimalFormat decimal = new DecimalFormat("0.00");
        Scanner ler = new Scanner(System.in);

        System.out.println("Entre com o valor da coordenada X1: ");
        x1 = ler.nextFloat();

        System.out.println("Entre com o valor da coordenada Y1: ");
        y1 = ler.nextFloat();

        System.out.println("Entre com o valor da coordenada X2: ");
        x2 = ler.nextFloat();

        System.out.println("Entre com o valor da coordenada Y2: ");
        y2 = ler.nextFloat();

        distancia = (Math.pow((x2-x1), 2))+(Math.pow((y2-y1), 2));
        raiz = Math.sqrt(distancia);

        System.out.println("A distância entre os pontos é de: " + decimal.format(raiz));

    }
}
