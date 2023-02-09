package autonomia.poo.polimorfismo;

public class Reptil extends Animal {
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("diz que tá rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("réptil comendo");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de réptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
