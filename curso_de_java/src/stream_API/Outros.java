package stream_API;

import java.util.Arrays;
import java.util.List;

public class Outros {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("patricia", 7.0);
        Aluno a2 = new Aluno("Ana", 5.8);
        Aluno a3 = new Aluno("pedro", 9.8);
        Aluno a4 = new Aluno("yasmin", 8.8);
        Aluno a5 = new Aluno("paulo", 6.8);
        Aluno a6 = new Aluno("henrique", 9.2);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
        System.out.println("disntinct...");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSKIP/Limit");
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);
        System.out.println("\ntakewhile");
        alunos.stream()
                .distinct()
                .skip(2)
                .takeWhile(a -> a.nota >= 7)
                .forEach(System.out::println);

    }
}
