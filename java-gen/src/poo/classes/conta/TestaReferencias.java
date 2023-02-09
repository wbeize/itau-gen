package poo.classes.conta;

public class TestaReferencias {

    public static void main(String[] args) {
        ContaBancaria primeiraConta = new ContaBancaria();
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeira: " + primeiraConta.saldo);

        ContaBancaria segundaConta = primeiraConta;

        System.out.println("saldo da segunda conta: " + segundaConta.saldo);
    }

}
