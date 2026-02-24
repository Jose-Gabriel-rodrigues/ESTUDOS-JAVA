package POO.produtor;

public class comprateste {
    public static void main(String[] args) {
        compra c1 = new compra();
        c1.cliente = "jose gabriel";
        c1.itens.add(new item("Caneta", 20, 7.55));
        c1.itens.add(new item("borachar", 10, 3.55));
        c1.itens.add(new item("caderno", 1, 9.55));

        System.out.println("Produtor:" + c1.itens.size());
        System.out.println("O valor total: " + c1.valortotal());
    }
}
