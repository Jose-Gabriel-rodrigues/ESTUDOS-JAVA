package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class map {
    // resultado da aula 199. Map #02 //
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW", "AUDI", "HONDA");

        UnaryOperator<String> maiuscular = n -> n.toUpperCase();
        UnaryOperator<String> primeiraletra = n -> n.charAt(0) + "";
        UnaryOperator<String> grito = n -> n + "!!!";

        System.out.println("\n\n Usando composição...");
        marcas.stream()
                .map(maiuscular)
                .map(primeiraletra)
                .map(grito)
                .forEach(print);

    }

}
