package estruturasequencial;

import java.util.Scanner;

public class Ex3 {

    /* 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
          expressa em segundos e mostre-o expresso em horas, minutos e segundos. */

    public static void main(String[] args){

        int horas, minutos, segundos;
        int evento;
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantos segundos de duração teve o evento?");
        evento = ler.nextInt();

        horas = (evento / 3600);
        minutos = (evento % 3600) / 60;
        segundos = (minutos % 60);

        System.out.println("Uau!");
        System.out.println("O evento teve " + horas + " hora(s), " + minutos + " minutos e " + segundos + " segundos de duração.");

    }
}
