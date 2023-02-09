package lacoscondicionais;

import java.util.Scanner;

public class Ex3 {

    /* 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
          categoria ela se encontra:
                                       10-14 infantil
                                       15-17 juvenil
                                       18-25 adulto
     */

    public static void main(String[] args) {

        int idade;
        String nome;
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual sua idade?");
        idade = ler.nextInt();
        ler.nextLine();
        System.out.println("Qual seu nome?");
        nome = ler.nextLine();

        if(idade > 0 && idade <= 14) {
            System.out.println("Que bacana, " + nome + ". Sua categoria é infantil!");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Ois, " + nome + ", xovem!");
        } else {
            System.out.println(nome + ", você já cringe, né, pessoa adulta?");
        }
    }
}
