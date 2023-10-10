package FunctionalInterface_WithLambdaExpression;

public class Main {
    public static void main(String[] args) {
        greet(message -> System.out.println(message));
    }

    public static void greet(Printer printer) {
        printer.print("Hello World!");
    }
}
