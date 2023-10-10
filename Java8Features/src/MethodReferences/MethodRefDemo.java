package MethodReferences;

public class MethodRefDemo {
    public MethodRefDemo(String message){
        // ...
    }

    public static void show() {
        // class/object::method

        // referencing on a in-built method (Lambda expression)
        // greet(message -> System.out.println(message));
        // // referencing on a in-built method (Method Ref:)
        // greet(System.out::println);

        // // referencing on a static method (Lambda expression)
        // greet(message -> MethodRefDemo.print(message));
        // // referencing on a static method (Method Ref:)
        // greet(MethodRefDemo::print);

        // // refencing on a constructor (Lambda expression)
        // greet(message -> new MethodRefDemo(message));
        // // refencing on a constructor (Method Ref:)
        // greet(MethodRefDemo::new);

        // refencing on a instance method (Lambda expression)
        MethodRefDemo demo = new MethodRefDemo("Hello World!");
        demo.greet(message -> demo.print(message));
        // refencing on a instance method (Method Ref:)
        greet(demo::print);
    }

    public void print(String message) {
        System.out.println(message);
    }

    public static void greet(Printer printer){
        printer.print("Hello World!");
    }
}
