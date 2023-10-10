package BuiltInFunctionalInterface.ComposingFunctionInterface;

import java.util.function.Function;

public class ComposingFunctionInterfaceDemo {
    public static void show() {
        Function<String, String> replaceColon = str ->str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";

        var result = replaceColon.andThen(addBraces).apply("Key:Value");
        System.out.println(result);
    }
}