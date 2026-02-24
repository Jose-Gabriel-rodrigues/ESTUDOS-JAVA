package POO.composicao_desafio;

import java.util.ArrayList;
import java.util.List;

public class cliente {
    String nome;
    List<compra> compras = new ArrayList<>();

    public cliente(String nome) {
        this.nome = nome;
    }

    double obtervalortotal1() {
        double total = 0;
        for (compra compra : compras) {
            total += compra.obtervalortotal();
        }
        return total;
    }

}
