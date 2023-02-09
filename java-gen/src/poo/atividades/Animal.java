package poo.atividades;

    /* Crie uma hierarquia de classes com atributos e comportamentos e as distribua de forma que tudo
    o que for comum fique na classe Animal. */

public class Animal {

    private String nome;
    protected int idade;
    protected String onomatopeia;
    private String habitat;
    private String alimentacao;
    private boolean extincao;

    public Animal(String nome, int idade, String onomatopeia,String habitat, String alimentacao, boolean extincao) {
        this.nome = nome;
        this.idade = idade;
        this.habitat = habitat;
        this.alimentacao = alimentacao;
        this.extincao = extincao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitats(String habitats) {
        this.habitat = habitats;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public boolean isExtincao() {
        return extincao;
    }

    public void setExtincao(boolean extincao) {
        this.extincao = extincao;
    }
}

