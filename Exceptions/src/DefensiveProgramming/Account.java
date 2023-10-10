package DefensiveProgramming;

import java.io.IOException;

public class Account {
    public void deposite(float amount) {
        if(amount <= 0)
            // with runtime exception
            throw new IllegalArgumentException("Amount must be greater than 0");
        else
            System.out.println("Deposite");
    }

    public void withdraw(float amount) throws IOException {
        if(amount <= 0)
            // with checked exception we have to sate the lead
            // exception on the color of the method declaration  
            throw new IOException("Amount should be greater than 0");
        else
            System.out.println("Withdraw");
    }
}
