package autonomia.estruturacondicional;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Você nasceu em qual ano?");

        int nasc = ler.nextInt();
        int i = 2023 - nasc;
        System.out.println("Sua idade é: " + i);
        if (i >= 18) {
            System.out.println("Você é maior de idade, tadinha! =/");
        } else {
            System.out.println("Você é menor de idade, pruveeeita! =)");
        }
    }
}
