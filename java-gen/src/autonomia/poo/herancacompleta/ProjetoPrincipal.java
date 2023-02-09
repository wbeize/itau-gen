package autonomia.poo.herancacompleta;

public class ProjetoPrincipal {
    public static void main(String[] args) {

        Funcionario[] f = new  Funcionario[3];
        f[0] = new Funcionario("Marieta","F",50,"Secretaria",true);
        f[1] = new Funcionario("Edgar","M",44,"Segurança",true);
        f[2] = new Funcionario("Flávio","O",38,"Projetos",true);

        Professor[] p = new Professor[3];
        p[0] = new Professor("Carol","F",35,"Cálculo",4500.25f);
        p[1] = new Professor("Zezin","M",40,"Métodos", 4500.25f);
        p[2] = new Professor("Augusta","F",45,"Aritmética",5000.0f);

        Aluno[] a = new Aluno[1];
        a[0] = new Aluno("Fernanda", "O",19,5698,"Tecnologia da Informação");
        a[1] = new Aluno("Otávio","M",20,7654,"Ciência de Dados");

        AlunoBolsista[] b = new AlunoBolsista[1];
        b[0] = new AlunoBolsista("Zuri","F",18,9852,"Sistemas da Informação",25.0f);
        b[1] = new AlunoBolsista("Agnus","F",20,9032,"Tecnologia da Informação",50.0f);

        AlunoTecnico[] t = new AlunoTecnico[1];
        t[0] = new AlunoTecnico("Bist","O",22,6789,99020965,"Engenharia da Computação");
        t[1] = new AlunoTecnico("Pedro","M",23,6501,99190823,"Engenharia da Computação");

        Visitante[] v = new Visitante[1];
        v[0] = new Visitante("João","M",15);
        v[1] = new Visitante("Maria","F",14);

        b[0].pagarMensalidade();
        b[1].cancelarMatricula();

    }
}
