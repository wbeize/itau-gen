package autonomia.poo.herancacompleta;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public Aluno(String nome, String sexo, int idade, int matricula, String curso) {
        this.nome = nome;
        this.setSexo(sexo);
        this.setIdade(idade);
        this.setMatricula(matricula);
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", curso='" + curso + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade de aluno " + this.nome);
    }

    public void cancelarMatricula() {
        System.out.println("Sua matrícula será cancelada =(");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
