package lambda_expressions.chapter3;

import java.util.stream.Stream;

/**
 * Created by hadeslee on 2016-07-24.
 */
public class GeneratingStreams {
    public static void main(String[] args) {
        iterate();
    }

    static void generate() {
        Stream.generate(() -> "hello world")
                .limit(3)
                .forEach(System.out::println);
    }

    static void iterate() {
        Stream.iterate(0, x -> x + 1)

                .limit(5)
                .forEach(System.out::println);
    }

}
