package Lambdas;

import java.util.function.BinaryOperator;

public class calcula_teste2 {
    public static void main(String[] args) {
        // passo 1 //

        // Calcular soma = (x, y) -> { return x + y; };
        // System.out.println(soma.executar(2, 3));

        // soma = (x, y) -> x * y;
        // System.out.println(soma.executar(2, 3));

        // passo 2 //

        // System.out.println(soma.legal());
        // System.out.println(Calcular.muitolegal());

        // passo 3 //

        BinaryOperator<Double> soma = (x, y) -> {
            return x + y;
        };

        System.out.println(soma.apply(2.0, 3.0));

        soma = (x, y) -> x * y;
        System.out.println(soma.apply(2.0, 3.0));

    }

}
