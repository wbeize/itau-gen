package poo.atividades;

    /* Implemente um programa que crie os 3 tipos de animais definidos no exercício
    anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
    é, independente dos animais. */

public class TesteAnimais {
    public static void main(String[] args) {
        Animal cavalo = new Animal("Pé de Pano", 25, "IRRANNHA",  "terrestre", "herbívoro", false);

        Animal preguica = new Animal("Flash", 44, "AHAAAHAN", "arborícola", "herbívora", true);

        Animal cachorro = new Animal("Vagabundo", 5, "AUAUAUAUUU", "terrestre", "carnívoro", false);
    }
}
