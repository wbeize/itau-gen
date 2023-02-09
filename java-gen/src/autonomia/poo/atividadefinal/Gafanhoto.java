package autonomia.poo.atividadefinal;

public class Gafanhoto extends Pessoa {

    private String login;
    private int totalAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, sexo, idade);
        this.login = login;
        this.totalAssistido = 0;
    }

    public void viuMaisUm() {
        totalAssistido++;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "login='" + login + '\'' + super.toString() +
                ", totalAssistido=" + totalAssistido +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    /*
    @Override
    public String toString() {
        return "=== { G A F A N H O T O } ===" +
                "\n login: '" + login + '\'' + super.toString() + " | totalAssistido: " + totalAssistido;
    }
     */
}
