package POO.composicao_desafio;

import java.util.ArrayList;
import java.util.List;

public class compra {
    final List<item> itens = new ArrayList<>();

    void adicionaritem(produtor n, int qtde) {
        this.itens.add(new item(n, qtde));
    }

    void adicionaritem(String nome, double preco, int qtde) {
        var produtor = new produtor(nome, preco);
        this.itens.add(new item(produtor, qtde));
    }

    double obtervalortotal() {
        double total = 0;
        for (item item : itens) {
            total += item.quatidade * item.produto.preco;
        }
        return total;
    }

}
