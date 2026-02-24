package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5 , 6, 7, 8, 9);
    
    BinaryOperator<Integer> soma = (ac , n) ->ac + n ; //É uma função que recebe dois argumentos do mesmo tipo e retorna um resultado do mesmo tipo.//

    Integer total1 = nums.parallelStream().reduce(soma).get();
    System.out.println(total1); // aqui n passamos o paramento entao tenhoi que usar "parallelStream" é o "get" no final//
    Integer total2 = nums.stream().reduce(100,soma);
    System.out.println(total2); // aqui8 foi usado o stream pq passamos um paramento que serio o 100//

    nums.stream()
        .filter(n -> n >5 ) // isso vai fazer com que ele comece depois do paremetro 5 da lista //
        .reduce(soma)
        .ifPresent(System.out::println);
}
}
