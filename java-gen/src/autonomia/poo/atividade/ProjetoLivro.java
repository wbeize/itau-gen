package autonomia.poo.atividade;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", "M", 22);
        p[1] = new Pessoa("Maria", "O", 33);
        p[2] = new Pessoa("Antonia","O",19);

        l[0] = new Livro("O que Javinha faz?", "AnguBistro",300,p[0]);
        l[1] = new Livro("UI/UX", "G. Gusman",500,p[1]);
        l[2] = new Livro("PHPzin","Maria Maria", 800,p[1]);

        l[0].abrir();
        l[0].folhear(299);

        l[1].abrir();
        l[1].proxPag();

        l[2].abrir();
        l[2].folhear(555);
        l[2].proxPag();

        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
    }
}
