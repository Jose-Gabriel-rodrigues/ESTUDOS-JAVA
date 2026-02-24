package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class match {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10.0);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Predicate<Aluno> reprovado = aprovado.negate();
        System.out.println(alunos.stream().allMatch(aprovado));// vai prgunta se todos passarm ncaso n vai retonar
                                                               // false, se sim vai retorna true
        System.out.println(alunos.stream().anyMatch(aprovado));
        System.out.println(alunos.stream().noneMatch(reprovado));

    }

}
