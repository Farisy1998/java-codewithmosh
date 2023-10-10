package ChainingException;

public class Main {
    public static void main(String[] args) {
        var account = new Account();
        try {
            account.withdraw(3000);
        } catch (AccountException e) {
            e.printStackTrace();
        }
    }
}
