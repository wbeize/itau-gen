package autonomia.poo.classes;

public class Caneta {
    public String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public Caneta(String m, String c, float p) { // método construtor | mesmo nome da classe
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }

    public void status() {
        System.out.println("SOBRE A CANETA\n");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
