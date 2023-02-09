package poo.classes.aviao;

public class TestaAviao {

    public static void main(String[] args) {
        Aviao novoAviao = new Aviao(2,false,"carga",
                "booeing","Gol","branco",6000,3, true);

        System.out.println("Quantidade de motores: " + novoAviao.getMotores());
        System.out.println("Tipo de transporte: " + novoAviao.getTipoTransporte());
        System.out.println("Cor do avião: " + novoAviao.getCor());
        System.out.println("Quantidade de classes do voo: " + novoAviao.getClasses());

        if(novoAviao.isTemLanchinho() == false) {
            System.out.println("Tem lanchinho? não, não tem!");
        } else {
            System.out.println("Tem lanchinho? não, não tem!");
        }

        System.out.println("Tem lanchinho?" + novoAviao.isTemLanchinho());
    }
}
