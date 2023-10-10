package BuiltInFunctionalInterface.UnaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void show() {
        UnaryOperator<Integer> squre = n -> n * n;
        UnaryOperator<Integer> increment = n -> ++n;

        var result = increment.andThen(squre).apply(1);
        System.out.println(result);
    }
}
