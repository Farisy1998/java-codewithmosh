package ChainingException;

public class AccountException extends Exception {
    public AccountException(Exception cause){
        super(cause);
    }
}