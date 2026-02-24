package Lambdas;
import java.util.function.UnaryOperator;

public class OperadorUnario {

    // passo da aula 187 //

public static void main(String[] args) {
    UnaryOperator <Integer> maisDois = n -> n + 2;
    UnaryOperator <Integer> vezesdois = n -> n * 2;
    UnaryOperator <Integer> aoquadrado = n -> n * n;

    int resultado1 = maisDois
    .andThen(vezesdois)
    .andThen(aoquadrado)
    .apply(0);

    System.out.println(resultado1);

    int resultado2 = maisDois
    .andThen(vezesdois)
    .andThen(aoquadrado)
    .apply(0);

    System.out.println(resultado2);

}
}
