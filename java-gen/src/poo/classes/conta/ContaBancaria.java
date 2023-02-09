package poo.classes.conta;

    /* 6) Crie uma classe conta bancaria e apresente os atributos e métodos
          referentes esta classe, em seguida crie um objeto conta bancaria, defina
          as instancias deste objeto e apresente as informações deste objeto no
          console. */

public class ContaBancaria {
    double saldo;
    int agencia;
    int numero;
    String titular;

    void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, ContaBancaria destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }
}

