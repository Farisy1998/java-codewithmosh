package RethowExceptions;

import java.io.IOException;

public class Account {
    public void deposite(float amount) {
        if(amount <= 0)
            throw new IllegalArgumentException("Amount must be grater than 0");
    }

    public void withdraw(float amount) throws IOException {
        if(amount <= 0)
            throw new IOException("Amount must be greater than 0");
    }
}
