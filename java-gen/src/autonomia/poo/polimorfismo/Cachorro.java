package autonomia.poo.polimorfismo;

import java.util.Objects;

public class Cachorro extends Lobo {

    @Override
    public void emitirSom() {
        System.out.println("AU! AU! AUUU!");
    }

    public void reagir(String frase) {
        if(Objects.equals(frase, "Toma comida") || Objects.equals(frase, "Ois")) {
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
            emitirSom();
        }

    }

    public void reagir(int hora, int min) {
        if(hora < 12) {
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }

    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("É o dono -> Abanar o rabo");
        } else {
            System.out.println("Não é o dono -> Abanar e latir");
        }
    }

    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println(" -> Tá abanando!");
            } else {
                System.out.println(" -> Tá latindo!");
            }
        } else {
            if (peso < 10) {
                System.out.println(" -> Tá rosnando!");
            } else {
                System.out.println(" -> Ih, tá ignorando!");
            }
            
        }
    }
}
