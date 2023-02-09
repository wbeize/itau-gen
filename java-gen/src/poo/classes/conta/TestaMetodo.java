package poo.classes.conta;

public class TestaMetodo {
    public static void main(String[] args) {
        ContaBancaria contaA = new ContaBancaria();
        contaA.saldo = 100;
        contaA.deposita(50);
        System.out.println(contaA.saldo);

        boolean conseguiuRetirar = contaA.saca(20);
        System.out.println(contaA.saldo);
        System.out.println(conseguiuRetirar);

        ContaBancaria contaB = new ContaBancaria();
        contaB.deposita(1000);

        if(contaB.transfere(300, contaA)) {
            System.out.println("trasnferencia com sucesso");
        } else {
            System.out.println("faltou dinheiro");
        }
        System.out.println(contaB.saldo);
        System.out.println(contaA.saldo);
    }
}
