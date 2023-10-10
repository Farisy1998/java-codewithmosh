package BuiltInFunctionalInterface.BinaryOperatorInterface;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorInterfaceDemo {
    public static void show() {
        BinaryOperator<Integer> add = (a, b) -> a + b;
        var result = add.apply(1, 2);
        System.out.println(result);

        // composing function
        Function<Integer, Integer> squre = a -> a * a; 
        var anotherResult = add.andThen(squre).apply(1, 2);
        System.out.println(anotherResult);
    }
}
