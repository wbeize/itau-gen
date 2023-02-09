package lacosrepeticao;

import java.util.Scanner;

public class Ex3 {

    /* 3- (WHILE) Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
           21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
           idade for =-99. */

    public static void main (String[] args) {

        int idade = 0, menor = 0, maduras = 0;
        Scanner ler = new Scanner(System.in);

        while (idade != -99) {
            System.out.println("Qual sua idade?");
            idade = ler.nextInt();

            if (idade < 21 && idade >= 0) {
                menor++;
            }

            if (idade > 50) {
                maduras++;
            }
        }

        System.out.println("Total de pessoas xôvens com -21: " + menor);
        System.out.println("Total de pessoas maduras com +50: " + maduras);
    }

}
