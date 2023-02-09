package autonomia.poo.encapsulamento;

public class ControleRemoto implements Controlador {
    // atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // construtor
    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(true);
        this.setTocando(false);
    }

    // métodos especiais -- implementação do Controlador

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("------------M-E-N-U--------------\n");
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print(" |");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("\n");
        System.out.println("-----f-e-c-h-a-n-d-o-m-e-n-u-----");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("TV desligada");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.isTocando() && this.isTocando()) {
            this.setTocando(false);
        }
    }

    // getter e setter PRIVADOS -- pq só vamos utilizar os métodos da interface
    private int getVolume() {
        return volume;
    }

    private void setVolume(int v) {
        this.volume = v;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean t) {
        this.tocando = t;
    }
}
