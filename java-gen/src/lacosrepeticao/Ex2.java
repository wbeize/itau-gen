package lacosrepeticao;

import java.util.Scanner;

public class Ex2 {

        // 2- (FOR) Ler 10 números e imprimir quantos são pares e quantos são ímpares.

        public static void main (String[] args) {

            int cont, num = 0, par = 0, impar = 0;
            Scanner ler = new Scanner(System.in);

            for (cont = 0; cont < 10; cont++) {
                System.out.println("Fala um número: ");
                num = ler.nextInt();

                if (num % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }

            System.out.println("Você digitou " + par + " números pares.");
            System.out.println("Você digitou " + impar + "números ímpares.");
        }
}
