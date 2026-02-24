package Lambdas;

import java.util.function.Function;

public class funcao {

    // passo da aula 184 //

    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";

        Function<String, String> resultado = valor -> "O resultado é:" + valor;

        Function<String, String> empolgado = valor -> valor + "!!!";

        String resultadofinal = parOuImpar.andThen(resultado).andThen(empolgado).apply(32);
        System.out.println(parOuImpar.apply(32));
        System.out.println(resultadofinal);

    }

}
