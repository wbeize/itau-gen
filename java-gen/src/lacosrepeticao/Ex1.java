package lacosrepeticao;

public class Ex1 {

    /* 1- (FOR) Informar todos os números de 1000 a 1999 que quando divididos por
          11 obtemos resto = 5. */

    public static void main (String[] args) {

        int i;

        for (i = 1000; i < 2000; i++) {
            if ( i % 11 == 5) {
                System.out.println(i);
            }
        }

    }
}
