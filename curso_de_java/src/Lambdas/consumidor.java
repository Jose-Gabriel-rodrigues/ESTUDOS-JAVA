package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumidor {
    // passo da aula 183 //
    public static void main(String[] args) {
        Consumer<Produto1> imprimirnome = p -> System.out.println(p.nome + "!!!");
        Produto1 p1 = new Produto1("caneta", 2.50, 0.01);
        imprimirnome.accept(p1);

        Produto1 p2 = new Produto1("Notebook", 2700.00, 0.25);
        Produto1 p3 = new Produto1("Caderno", 27.00, 0.05);
        Produto1 p4 = new Produto1("Mochila", 50.00, 0.25);
        Produto1 p5 = new Produto1("Corretivo", 2.00, 0.10);

        List<Produto1> produtors = Arrays.asList(p1, p2, p3, p4, p5);

        produtors.forEach((imprimirnome));
        produtors.forEach(p -> System.out.print(p.nome + " " + p.preco + " :\n"));
        produtors.forEach(System.out::println);

    }

}
