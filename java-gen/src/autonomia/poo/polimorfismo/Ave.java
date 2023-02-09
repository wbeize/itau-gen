package autonomia.poo.polimorfismo;

public class Ave extends Animal {
    private String corPena;

    // sobreposição - métodos sobrepostos

    @Override
    public void locomover() {
        System.out.println("voando");
    }

    @Override
    public void alimentar() {
        System.out.println("ave voando");
    }

    @Override
    public void emitirSom() {
        System.out.println("ave tá piaaano");
    }

    // métodos adicionais

    public void fazerNinho() {
        System.out.println("construiu ninho");
    }

    //

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
