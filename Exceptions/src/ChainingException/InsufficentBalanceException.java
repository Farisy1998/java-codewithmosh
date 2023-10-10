package ChainingException;

public class InsufficentBalanceException extends Exception {
    public InsufficentBalanceException() {
        super("Insufficent balance");
    }

    public InsufficentBalanceException(String message) {
        super(message);
    }
}
