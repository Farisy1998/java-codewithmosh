package BuiltInFunctionalInterface.PredicateInterface;

import java.util.function.Predicate;

public class PredicateInterfaceDemo {
    public static void show() {
        Predicate<String> isLongerthan5 = str -> str.length() > 5;
        var result = isLongerthan5.test("sky");
        System.out.println(result);
    }
}
