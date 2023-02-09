package autonomia.poo.atividadefinal;

public class ProjetoYouTube {
    public static void main(String[] args) {

        Video v[] = new Video[3];

        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        Gafanhoto g[] = new Gafanhoto[3];
        g[0] = new Gafanhoto("Jubilau",22,"M", "jujuba");
        g[1] = new Gafanhoto("Juca",21,"F","jacool");
        g[2] = new Gafanhoto("Rampi",32,"F","rampuca");


        Visualizacao vis[] = new Visualizacao[5];
        vis [0] = new Visualizacao(g[0], v[2]); // -> JUBILAU ASSISTE HTML
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[1]); // -> JUBILAU ASSISTE PHP
        vis[0].avaliar(87f);
        System.out.println(vis[1].toString());

        /*
        System.out.println("VÍDEOS \n -----------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println("\n GAFANHOTOS \n -------------------");
        System.out.println(g[2].toString());
        System.out.println(g[0].toString());
         */
    }
}
