package BuiltInFunctionalInterface.CombiningPredicates;

import java.util.function.Predicate;

public class CombiningPredicateDemo {
    public static void show () {
        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");

        // with logical AND (&&)
        var hasLeftAndRightBrace = hasLeftBrace.and(hasRightBrace);
        var result1 = hasLeftAndRightBrace.test("{key:value}");
        System.out.println(result1);

        // with logical OR (||)
        var hasLetfOrRightBrace = hasLeftBrace.or(hasRightBrace);
        var result2 = hasLetfOrRightBrace.test("{key:value}");
        System.out.println(result2);

        // with logical NOT (!)
        var hasNoLeftBrace = hasLeftBrace.negate().test("{key:value}");
        System.out.println(hasNoLeftBrace);
    }
}
