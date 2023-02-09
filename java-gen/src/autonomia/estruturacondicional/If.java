package autonomia.estruturacondicional;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float n1 = ler.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float n2 = ler.nextFloat();
        float m = (n1 + n2) / 2;
        System.out.println("Sua média foi " + m);

        if (m > 9) {
            System.out.println("Parabéns, você teve uma média excelente!");
        }
    }
}
