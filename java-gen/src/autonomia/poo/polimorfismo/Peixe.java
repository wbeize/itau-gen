package autonomia.poo.polimorfismo;

public class Peixe extends Animal {
    private String corEscama;

    // sobreposição

    @Override
    public void locomover() {
        System.out.println("nadando...");
    }

    @Override
    public void alimentar() {
        System.out.println("peixe comendo");
    }

    @Override
    public void emitirSom() {
        System.out.println("véi, peixe não faz som");
    }

    // método adicional

    public void soltarBolha() {
        System.out.println("soltando bolhas ooo");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
