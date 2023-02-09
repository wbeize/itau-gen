package autonomia.estruturacondicional;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual sua idade?");
        int nasc = ler.nextInt();
        int i = 2023 - nasc;
        if (i < 16) {
            System.out.println("Pequenin demais. Cê ainda não vota!");
        } else if ((i >= 16 && i < 18) || (i > 70)) {
            System.out.println("Meio-fio. Corda-bamba. Cê quem decide! :)");
        } else {
                System.out.println("Vish! Você faz ou faz!");
        }
    }
}
