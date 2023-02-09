package autonomia.poo.herancacompleta;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public Funcionario(String nome, String sexo, int idade, String setor, boolean trabalhando) {
        this.setNome(nome);
        this.setSexo(sexo);
        this.setIdade(idade);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    public void mudarTrabalho() {
        this.trabalhando =! this.trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
