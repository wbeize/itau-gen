package autonomia.poo.polimorfismo;

public class Canguru extends Mamifero {

    public void usarBolsa() {
        System.out.println("Sou um marsupial. Uso uma bolsinha! :)");
    }

    @Override
    public void locomover() {
        System.out.println("salta salta salta");
    }
}
