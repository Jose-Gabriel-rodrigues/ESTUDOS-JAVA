package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class desafio {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

// meu codigo//


        // List<String> binarios = numeros.stream()
        //         .map(Integer::toBinaryString).toList();

        // List<String> enverteBinarios = numeros.stream()
        //         .map(Integer::toBinaryString) // converte em binário
        //         .map(bin -> new StringBuilder(bin).reverse().toString()) // inverte
        //         .toList();

        // List<Integer> binarios_invertido = enverteBinarios.stream()
        //         .map(bin -> Integer.parseInt(bin, 2))
        //         .toList();

        // System.out.println(numeros);
        // System.out.println(binarios);
        // System.out.println(enverteBinarios);
        // System.out.println(binarios_invertido);

//codigo do professor//

        UnaryOperator<String> inverter = s -> new StringBuilder(s).toString();

        Function <String , Integer> binarioParaInt = s -> Integer.parseInt(s, 2);
        numeros.stream()
            .map(Integer::toBinaryString)
            .map(inverter)
            .map(binarioParaInt)
            .forEach(System.out::println);

    }

}
