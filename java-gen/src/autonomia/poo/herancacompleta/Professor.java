package autonomia.poo.herancacompleta;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public Professor(String nome, String sexo, int idade, String especialidade, float salario) {
        this.nome = nome;
        this.setSexo(sexo);
        this.setIdade(idade);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void receberAumento(float aum) {
        this.salario += aum;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
