package lacosrepeticao;

import java.util.Scanner;

public class Ex4 {

    /* 4- (WHILE) Uma empresa desenvolveu uma pesquisa para saber as características
          psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
          era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
          (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
          agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
          pessoas, calcule e mostre:

                                        o número de pessoas calmas;
                                        o número de mulheres nervosas;
                                        o número de homens agressivos;
                                        o número de outros calmos;
                                        o número de pessoas nervosas com mais de 40 anos;
                                        o número de pessoas calmas com menos de 18 anos. */

    public static void main (String[] args) {

        int idade, sexo, opcao, pesquisa = 0;
        int calmas = 0, nervosas = 0, agressivas = 0, calmos = 0, nervosos = 0, agressivos = 0;
        int calmes = 0, pessoasCalmas = 0, maisNervosas = 0, menosCalmas = 0;
        Scanner ler = new Scanner(System.in);

        while(pesquisa < 2) {

            System.out.println("Qual sua idade?");
            idade = ler.nextInt();

            System.out.println("Qual seu sexo? \n 1. Masculino | 2. Feminino | 3. Outros");
            sexo = ler.nextInt();

            if(sexo == 1) {
                System.out.println("Como você se considera? \n 1. Calmo | 2. Nervoso | 3. Agressivo");
                opcao = ler.nextInt();
            } else if (sexo == 2) {
                System.out.println("Como você se considera? \n 1. Calma | 2. Nervosa | 3. Agressiva");
                opcao = ler.nextInt();
            } else {
                System.out.println("Como você se considera? \n 1. Calme | 2. Nervose | 3. Agressive");
                opcao = ler.nextInt();
            }

            if (opcao == 1) {
                pessoasCalmas++;
            }

            if (sexo == 2 && opcao == 2) {
                nervosas++;
            }

            if (sexo == 1 && opcao == 3) {
                agressivos++;
            }

            if (sexo == 3 && opcao == 1) {
                calmes++;
            }

            if (idade > 40 && opcao == 2) {
                maisNervosas++;
            }

            if (idade < 18 && opcao == 1) {
                menosCalmas++;
            }

            pesquisa++;
        }

        System.out.println("Total de pessoas calmas: " + calmas);
        System.out.println("Total de mulheres nervosas: " + nervosas);
        System.out.println("Total de homens agressivos: " + agressivos);
        System.out.println("Total de outros calmos: " + calmes);
        System.out.println("Total de pessoas acima de 40 nervosas: " + maisNervosas);
        System.out.println("Total de pessoas abaixo de 18 calmas: " + menosCalmas);

    }
}


