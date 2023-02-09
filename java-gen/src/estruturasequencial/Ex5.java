package estruturasequencial;

import java.util.Scanner;

public class Ex5 {

    /* 5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno.
          Considerar que a média é ponderada e que o peso das notas é: 2, 3 e 5, respectivamente. */

    public static void main(String[] args){

        double materiaX, materiaY, materiaZ, media;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a nota da materiaX: ");
        materiaX = ler.nextFloat() * 2;

        System.out.println("Informe a nota da materiaY: ");
        materiaY = ler.nextFloat() * 3;

        System.out.println("Informe a nota da materiaZ: ");
        materiaZ = ler.nextFloat() * 5;

        media = (materiaX + materiaY + materiaZ) / 10;

        System.out.println("\n A média foi: " + media + " .");

    }
}
