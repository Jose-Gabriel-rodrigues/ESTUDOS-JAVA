package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class operadorBinario {

    // passo da aula 186 //

    public static void main(String[] args) {
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(9.8, 5.7));

        BiFunction<Double, Double, String> resultado = (n1, n2) -> {
            Double notafinal = (n1 + n2) / 2;
            return notafinal >= 7 ? "aprovado" : "reprovado";
        };
        System.out.println(resultado.apply(9.7, 4.1));
        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(media.andThen(conceito).apply(9.7, 5.1));
    }

}
