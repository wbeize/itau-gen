package autonomia.poo.objetos;

public class TestaConta {
    public static void main(String[] args) {
        Conta p1 = new Conta();
        p1.setNome("Jubileu");
        p1.setNumConta(78912);
        p1.abrirConta("CC");

        Conta p2 = new Conta();
        p2.setNome("Creuza");
        p2.setNumConta(12398);
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);

        p1.sacar(150);
        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
