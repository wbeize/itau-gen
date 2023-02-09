package autonomia.poo.relacionamento;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // métodos públicos

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria())
            && l1 != l2) {
            this.aprovada = true;
            this.desafiante = l1;
            this.desafiado = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("=== DESAFIADO ===");
            this.desafiado.apresentar();
            System.out.println("=== DESAFIANTE ===");
            this.desafiante.apresentar();

            Random aleatorio = new Random();               // importando random - java util
            int vencedor = aleatorio.nextInt(3);   // bound: 3 resultados que são >> 0 1 2
            switch (vencedor) {
                case 0: // Empate
                    System.out.println("=== A LUTA EMPATOUUUU!!! ===");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                break;
                case 1: // Desafiado vence
                    System.out.println("=== VITÓRIA DE " + this.desafiado.getNome() + "!!! ===");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                break;
                case 3: // Desafiante vende
                    System.out.println("=== VITÓRIA DE " + this.desafiante.getNome() + "!!! ===");
                    this.desafiante.ganharLuta();
                    this.desafiante.perderLuta();
                break;
            }
        } else {
            System.out.println("A luta não pode acontecer! :(");
        }
    }

    // métodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
