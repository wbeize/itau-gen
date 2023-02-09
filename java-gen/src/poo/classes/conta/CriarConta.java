package poo.classes.conta;

public class CriarConta {

    public static void main(String[] args) {
        ContaBancaria primeiraConta = new ContaBancaria();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        ContaBancaria segundaConta = new ContaBancaria();
        segundaConta.saldo = 50;

        System.out.println("primeira conta tem "+ primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);

        System.out.println(primeiraConta.agencia);
        System.out.println(segundaConta.agencia);


    }
}
