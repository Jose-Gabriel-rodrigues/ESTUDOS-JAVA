package classes_e_metodos.produtor;

public class sub_produto {
    public static void main(String[] args) {
        desafio_02_produto d1 = new desafio_02_produto();
        d1.nome = "caneta";
        d1.valor = 12.50;
        desafio_02_produto.descontor = 0.05;

        System.out.printf("%.2f", d1.Soma());

    }
}
