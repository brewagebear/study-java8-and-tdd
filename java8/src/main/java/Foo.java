import java.util.function.*;

public class Foo {
    public static void main(String[] args) {
        Function<Integer, Integer> plus10 = (number) -> number + 10;
        Function<Integer, Integer> multiple2 = (number) -> number * 2;

        UnaryOperator<Integer> unaryPlus10 = (number) -> number + 10;
        UnaryOperator<Integer> unaryMultiple2 = (number) -> number * 2;

        Function<Integer, Integer> multiple2AndPlus10 = plus10.compose(multiple2);
        System.out.println(multiple2AndPlus10.apply(10));

        Function<Integer, Integer> plus10AndMultiple2 = plus10.andThen(multiple2);
        System.out.println(plus10AndMultiple2.apply(10));

        Consumer<Integer> printT = integer -> System.out.println(integer);
        printT.accept(10);

        Supplier<Integer> get10 = () -> 10;
        get10.get();

        Predicate<String> startWithSean = (s) -> s.startsWith("sean");
        System.out.println(startWithSean.test("sin"));

        Predicate<Integer> isOdd = (i) -> i%2 == 1;
        System.out.println(isOdd.test(3));


    }
}
