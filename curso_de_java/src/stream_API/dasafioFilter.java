package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class dasafioFilter {
    public static void main(String[] args) {
        Produto p1 = new Produto("Lapis", 1.99, 0.35, 0);
        Produto p2 = new Produto("notebook", 2750.99, 0.30, 0);
        Produto p3 = new Produto("Ipad", 2500.33, 0.40, 0);
        Produto p4 = new Produto("caderno", 29.99, 0.35, 0);
        Produto p5 = new Produto("impresora", 899.90, 0.20, 0);
        Produto p6 = new Produto("capinha", 1.99, 0.35, 0);
        Produto p7 = new Produto("borrachar", 7.99, 0.10, 0);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        Predicate<Produto> superPromocao = p -> p.desconto >= 0.3;
        Predicate<Produto> freteGratis = p -> p.valorfrete == 0;
        Predicate<Produto> precorelevante = p -> p.preço >= 500;
        Function<Produto, String> chamadaPromocional = p -> "Aproveite!" + p.nome + "por R$" + p.preço;

        produtos.stream()
                .filter(superPromocao)
                .filter(freteGratis)
                .filter(precorelevante)
                .map(chamadaPromocional)
                .forEach(System.out::println);

    }

}
