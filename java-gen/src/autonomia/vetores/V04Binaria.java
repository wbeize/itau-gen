package autonomia.vetores;

import java.util.Arrays;

public class V04 {
    public static void main(String[] a) {

        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for (int v:vet) {
            System.out.print(v + " | ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 1); // -> busca binária em vetor
        System.out.println("Encontrei o valor na posição: " + p);
    }
}
