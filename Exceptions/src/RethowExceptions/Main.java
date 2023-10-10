package RethowExceptions;

public class Main {
    public static void main(String[] args) {
        var exception = new ExceptionDemo();
        try {
            exception.show();
        } catch (Exception e) {
            System.out.println("Somthing went wrong");
        }
    }
}
