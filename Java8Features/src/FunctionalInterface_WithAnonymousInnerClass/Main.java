package FunctionalInterface_WithAnonymousInnerClass;

public class Main {
    public static void main(String[] args) {
        greet(new Printer() { // Anonymous Inner Class
            @Override
            public void print(String message) {
                System.out.println(message);        
            }
        });
    }

    public static void greet(Printer printer) {
        printer.print("Hello World!");
    }
}
