package estruturasequencial;

import java.util.Scanner;

public class Ex1 {

    /* 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
          dias e mostre-a expressa apenas em dias. */

    public static void main(String[] args) {

        int anos, meses, dias;
        int idadeEmDias;
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual sua idade?");
        anos = ler.nextInt();

        System.out.println("Quantos meses se passaram desde seu último mês de nascimento?");
        meses = ler.nextInt();

        System.out.println("Que dia é hoje?");
        dias = ler.nextInt();
        System.out.println("\n");

        idadeEmDias = anos * 365 + meses * 30 + dias;

        System.out.println("Que bacana!");
        System.out.println("Você tem "+ anos +" anos, " + meses + " meses e " + dias + " dias.");
        System.out.println("E isso quer dizer que você tem " + idadeEmDias + " dias de vida! :)");

    }
}
