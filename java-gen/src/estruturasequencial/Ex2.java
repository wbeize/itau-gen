package estruturasequencial;

import java.util.Scanner;

public class Ex2 {

    /* 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
          expressa em anos, meses e dias. */

    public static void main(String[] args) {

        int anos, meses, dias;
        int idadeEmDias;
        Scanner ler = new Scanner(System.in);

        System.out.println("Cê tem quantos dias de vida?");
        idadeEmDias = ler.nextInt();

        anos = (idadeEmDias / 365);
        meses = (idadeEmDias - (365 * anos)) / 30;
        dias = (idadeEmDias - (360 * anos)) % 30;

        System.out.println("\n");
        System.out.println("Que bacana!");
        System.out.println("Você tem "+ anos +" anos, " + meses + " meses e " + dias + " dias.");

    }
}
