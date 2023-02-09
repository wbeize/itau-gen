package estruturasequencial;

import java.util.Scanner;

public class Ex8 {

    /* 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
          percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
          Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
          escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. */

    public static void main(String[] args){

        float carroNovo, custo, distribuidor, impostos;
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual o custo de fábrica? ");
        custo = ler.nextFloat();

        distribuidor = ((custo / 100) * 28);
        impostos = ((custo / 100) * 45);
        carroNovo = ((distribuidor + impostos) + custo);

        System.out.println("O custo do carro novo é: " + carroNovo);
        System.out.println("A porcentagem do distribuidor é: " + distribuidor);
        System.out.println("O total de impostos é de: " + impostos);

    }
}
