package autonomia.poo.encapsulamento;

public class TestaControle {
    public static void main(String[] args) {
        ControleRemoto cr = new ControleRemoto();
        cr.maisVolume();
        cr.ligarMudo();
        cr.abrirMenu();

        cr.fecharMenu();
    }
}
