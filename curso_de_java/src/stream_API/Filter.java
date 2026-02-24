package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.8);

        Aluno a2 = new Aluno("Ana", 5.8);
        Aluno a3 = new Aluno("pedro", 9.8);
        Aluno a4 = new Aluno("yasmin", 8.8);
        Aluno a5 = new Aluno("paulo", 6.8);
        Aluno a6 = new Aluno("henrique", 9.2);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, String> saudacaoaprovado = a -> "! Parabéns " + a.nome + " Voce foi aprovado(a)!";

        alunos.stream().filter(aprovado)
                .map(saudacaoaprovado)
                .forEach(System.out::println);

    }
}
