package autonomia.poo.herancacompleta;

public class AlunoBolsista extends Aluno {
    private float bolsa;

    public AlunoBolsista(String nome, String sexo, int idade, int matricula, String curso, float bolsa) {
        super(nome, sexo, idade, matricula, curso);
        this.bolsa = bolsa;
    }

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.nome);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsista! Pagamento facilitado! =)");
    }

    @Override
    public void cancelarMatricula() {
        System.out.println("Bolsista, sua matrícula será cancelada. =/");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
