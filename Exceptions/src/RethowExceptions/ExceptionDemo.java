package RethowExceptions;

import java.io.IOException;

public class ExceptionDemo {
    public void show() throws IOException {
        var account = new Account();
        account.deposite(1000);
        try {
            account.withdraw(600);
        } catch (Exception e) {
            throw new IOException();
        }
    }
}
