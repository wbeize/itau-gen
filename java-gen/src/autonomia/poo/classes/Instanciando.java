package autonomia.poo.classes;

public class Instanciando {
    public static void main (String[] args) {
        Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f);
        c1.status();

        System.out.println("Tenho uma caneta " + c1.getModelo() + " " + c1.getPonta());

        Caneta c2 = new Caneta("NICff", "Amarelo", 0.8f);
        c2.status();
        System.out.println("Tenho uma caneta " + c2.getModelo() + " " + c2.getPonta());

    }
}
