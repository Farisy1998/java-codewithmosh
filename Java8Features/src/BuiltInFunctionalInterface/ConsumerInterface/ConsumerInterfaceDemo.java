package BuiltInFunctionalInterface.ConsumerInterface;

import java.util.List;

public class ConsumerInterfaceDemo {
    public static void show() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        
        // Imperative programing
        for(var item : list)
            System.out.println(item);

        // Declarative programing
        list.forEach(item -> System.out.println(item));
        // The forEach method here accepts a Consumer type
        // argument. The Consumer interface is a functional 
        // interface with a accept(T t) method. Since the Consumer
        // interface a funxtional interface, so we can use
        // lambda expression syntax to pass the argument to the
        // accept method in Consumer interface.

    }
}
