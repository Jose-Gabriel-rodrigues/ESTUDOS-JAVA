package Lambdas;

import java.util.Arrays;
import java.util.List;

public class foreach {

    // passo da aula 179 //
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
        System.out.println("Forma tradicional");
        for (String nome : aprovados) {
            System.out.println("Meu nome é " + nome);
        }
        System.err.println("\nLambda #01");
        aprovados.forEach(nome -> System.out.println(nome + "!!!"));

        System.out.println("\n Method reference #01 ...");
        aprovados.forEach(System.out::println);

        // passo aula 180//

        System.out.println("\nLambda #02");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\nMethod Reference#02");
        aprovados.forEach(foreach::meuImprimir);
    }

    static void meuImprimir(String nome) {
        System.out.println("oi Meu nome é " + nome);

    }

}