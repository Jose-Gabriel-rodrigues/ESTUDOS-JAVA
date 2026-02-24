package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class criandoStreams {
    // 197. Criando Stream //
    public static void main(String[] agrs) {
        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::print;

        Stream<String> langs = Stream.of("java", "Lua", "JS\n");
        langs.forEach(print);

        String[] maislongo = { "Python", "Lisp", "Perl", "Go\n" };

        Stream.of(maislongo).forEach(print);
        Arrays.stream(maislongo).forEach(print);
        Arrays.stream(maislongo, 1, 4).forEach(print);

        List<String> outrasLangs = Arrays.asList("c", "PHP", "kotlin\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);

        // Stream.generate(() -> "a").forEach(print);//
        Stream.iterate(0, n -> n + 1).forEach(println);

    }

}
