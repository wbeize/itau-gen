package autonomia.estruturacondicional;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        String tipo;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digita uma quantidade de pernas aí só préu ver um negócio?");
        int perna = ler.nextInt();

        System.out.println("Esse animal é um(a) ");

        switch (perna) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "Vish! Isso é um ET???";
        }
        System.out.println(tipo);
    }
}
