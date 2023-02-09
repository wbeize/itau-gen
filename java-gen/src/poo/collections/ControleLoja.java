package poo.collections;

import java.util.ArrayList;
import java.util.List;

public class ControleLoja {
    public static void main(String[] args) {

        // adiciona itens na lista
        List<String> estoque = new ArrayList<String>();
        estoque.add("Camisa");
        estoque.add("Vestido");
        estoque.add("Bota");

        // mostra antes da atualização
        System.out.println("Listagem antiga do estoque: " + estoque);

        // remove/atualiza itens da lista
        estoque.remove("Bota");

        // mostra itens da lista após atualização
        System.out.println("Listagem do estoque após remoção: " + estoque);

        // adiciona itens da lista
        estoque.add("Coturno");

        // mostra itens da lista
        System.out.println("Listagem atual do estoque: " + estoque);
    }
}
