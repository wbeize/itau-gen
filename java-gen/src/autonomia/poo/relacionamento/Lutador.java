package autonomia.poo.relacionamento;

public class Lutador implements Controller {
    // atributos
    private String nome, nacionalidade, categoria;
    private float altura, peso;
    private int idade, vitorias, derrotas, empates;

    // métodos públicos
    @Override
    public void apresentar() {
        System.out.println("Lutador: " + this.getNome() + ", " + this.getIdade() + " anos");
        System.out.println("Com " + this.getAltura() + "m de altura" + " e " + this.getPeso() + " Kg");
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Já ganhou: " + this.getVitorias() + " || Perdeu: " + this.getDerrotas() + " || Empatou: " + this.getEmpates());
        System.out.println("------------------------------------------");
    }

    @Override
    public void status() {
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    // métodos especiais

    public Lutador(String no, String na, float al, float pe, int id, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.altura = al;
        this.setPeso(pe);
        this.idade = id;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    // getter e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
