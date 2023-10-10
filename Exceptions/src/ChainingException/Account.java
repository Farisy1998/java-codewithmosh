package ChainingException;

public class Account {
    private double balance = 2000;

    public void deposite(float amount) {
        if(amount <= 0)
            throw new IllegalArgumentException("Amount should be greater than 0");
    }

    public void withdraw(float amount) throws AccountException {
        if(amount > balance)
            throw new AccountException(new InsufficentBalanceException());
    }

    public double getBalance(){
        return balance;
    }
}
