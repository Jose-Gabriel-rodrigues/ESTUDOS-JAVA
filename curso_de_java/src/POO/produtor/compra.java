package POO.produtor;

import java.util.ArrayList;

public class compra {
    String cliente;
    ArrayList<item> itens = new ArrayList<item>();

    double valortotal() {
        
        double total = 0;

        for (item item : itens) {
            total += item.quantidade * item.preco;
        }
        return total;
    }
}
