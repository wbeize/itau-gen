package autonomia.poo.atividade;

public interface Publicacao {
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int pag);
    public abstract void proxPag();
    public abstract void voltarPag();
}
