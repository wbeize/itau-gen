package autonomia.poo.atividade;

public class Livro implements Publicacao {
    private String titulo, autor;
    private int totalPag, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "------------------ Informações:" +
                "\n\n livro: '" + titulo + "', " +  totalPag + " páginas" +
                ", \n autor: '" + autor + "'" +
                ", \n página atual: " + pagAtual + " | aberto: " + aberto +
                ", \n leitor: " + leitor.getNome() + ", " + leitor.getSexo() + ", " + leitor.getIdade() + " anos \n";
    }

    public Livro(String titulo, String autor, int totalPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPag;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPag() {
        return totalPag;
    }

    public void setTotalPag(int totalPag) {
        this.totalPag = totalPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int pag) {
        if (pag > this.totalPag) {
            this.pagAtual = 0;
        } else {
            this.pagAtual = pag;
        }
    }

    @Override
    public void proxPag() {
            this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
