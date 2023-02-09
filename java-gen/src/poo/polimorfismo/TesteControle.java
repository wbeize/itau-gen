package poo.polimorfismo;

public class TesteControle {

    public static void main (String[] args) {

        ControleRemoto controleRemoto = new ControleRemoto();

        System.out.println("Chamando carro: " + controleRemoto.mover("Carro"));
        System.out.println("Chamando avião: " + controleRemoto.mover("Avião",true));
        System.out.println("Chamando barco: " + controleRemoto.mover("Barco",true,true));
    }
}
