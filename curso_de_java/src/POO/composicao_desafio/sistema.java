package POO.composicao_desafio;

public class sistema {
    public static void main(String[] args) {
        compra compra1 = new compra();
        compra1.adicionaritem(new produtor("impresora", 998.98), 1);

        compra compra2 = new compra();
        compra2.adicionaritem(new produtor("computador", 1000), 1);

        cliente cliente = new cliente("maria almedeida de souza");
        cliente.compras.add(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.nome);
        System.out.println(cliente.obtervalortotal1());

    }

}
