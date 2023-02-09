package autonomia.poo.objetos;

/* praticando o exemplo teórico que o guanabara utilizou em aula as numerações estão em ordem sortida, pois
    inseri quais são feitas primeiros, apesar de aparecerem em outra ordem
    durante o percurso do código. */

public class Conta {

    // parte 1. especificando atributos
    private String nome;
    public int numConta;
    protected String tipo;
    private float saldo;
    private boolean status;

    // parte 4. criando métodos especiais

    public void estadoAtual() {
        System.out.println("-----------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Status: " + this.isStatus());
        System.out.println("Saldo atual: " + this.getSaldo());
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso! :)");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Você ainda tem saldo. Transfira para fechar a conta.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Não dá pra fechar. Você tá em débito.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso! :(");
        }
    }

    public void depositar(float v) {
        if (this.isStatus()) {
            // this.saldo = this.saldo + v; mesma linha que de baixo
            this.setSaldo(this.getSaldo() + v); // linha correta, com métodos especiais
            System.out.println("Depósito realizado na conta de " + this.getNome());
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }

    public void sacar(float v) {
        if (this.isStatus()) {
            if (this.getSaldo() >= v ) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this. getNome());
            } else {
                System.out.println("Saque insuficiente :(");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }

    public void mensalidade() {
        int v = 0; // variavél local
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        } if (this.isStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga por " + this.getNome());
        } else {
            System.out.println("Impossível pagar. Conta fechada!");
        }

    }

    // parte 2. criando construtor

    public Conta() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    // 3. criando getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
