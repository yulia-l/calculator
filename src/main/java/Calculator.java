import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    public Calculator() {
    }

    public static Calculator getCalc() {
        return instance.get();
    }

    BinaryOperator<Integer> add = (x, y) -> x + y;

    BinaryOperator<Integer> subtract = (x, y) -> x - y;

    public int subtractAsString(String a, String b) {
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        return numA - numB;
    }

    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> divide = (x, y) -> y != 0 ? x / y : 0;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
