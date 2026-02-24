package Lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio_do_Lambda {

    // feito pelo prefessor //
    public static void main(String[] args) {

        Function<Produto1, Double> precofinal = p -> p.preco * (1 - p.desconto);

        UnaryOperator<Double> impostomunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;

        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;

        UnaryOperator<Double> arredondar = preco -> Math.round(preco * 100.0) / 100.0;

        Function< Double, String> formatar = preco -> String.format("R$ %.2f", preco).replace(".", ",");

        Produto1 p = new Produto1("Celular", 3235.89, 0.13);

        String preco = precofinal
                .andThen(impostomunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);

        System.out.println("O preço total: " + preco);
    }
}
// feito por mim //

// produtor produto = new produtor("Notebook", 3235.89, 0.13, 0.085);

// double precoComDesconto = produto.descontDouble(produto.preço);
// System.out.printf("O valor após o desconto vai ficar com: %.2f\n",
// precoComDesconto);

// double imposto = produto.impostovalor();
// System.out.printf("O valor do imposto é: %.2f\n", imposto);

// double frete = produto.frete();
// System.out.printf("O valor do frete total: %.2f\n", frete);

// double total = produto.valor();
// System.out.printf("Valor Total: %.2f\n", total);
