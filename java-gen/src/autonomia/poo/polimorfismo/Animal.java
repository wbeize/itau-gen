package autonomia.poo.polimorfismo;

public abstract class Animal {
    protected int peso;
    protected int idade, membros;
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
}
