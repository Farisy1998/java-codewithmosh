package BuiltInFunctionalInterface.FunctionInterface;

import java.util.function.Function;

public class FunctionInterfaceDemo {
    public static void show() {
        Function<String, Integer> obj = str -> str.length();
        var len = obj.apply("Hi");
        System.out.println(len);
    }
}
