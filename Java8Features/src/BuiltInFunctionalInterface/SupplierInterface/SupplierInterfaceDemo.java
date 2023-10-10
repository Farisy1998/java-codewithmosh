package BuiltInFunctionalInterface.SupplierInterface;

import java.util.function.Supplier;

public class SupplierInterfaceDemo {
    public static void show() {
        Supplier<Double> random = () -> Math.random();
        var value = random.get();
        System.out.println(value);
    }
}
