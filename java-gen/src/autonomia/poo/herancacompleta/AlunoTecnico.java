package autonomia.poo.herancacompleta;

public class AlunoTecnico extends Aluno {
    private int registroProfissional;

    public AlunoTecnico(String nome, String sexo, int idade, int matricula, int rgProf, String curso) {
        super(nome, sexo, idade, matricula, curso);
        this.registroProfissional = rgProf;
    }

    public void praticar() {
        System.out.println("Você está praticando sua função =)");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade de aluno técnico " + this.nome);
    }

    @Override
    public void cancelarMatricula() {
        System.out.println("Cancelando matrícula de aluno técnico " + this.nome);
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
