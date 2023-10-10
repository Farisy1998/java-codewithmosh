package DefensiveProgramming;

public class Main {
    public static void main(String[] args) {
        var account = new Account();

        account.deposite(1000);
        try {
            account.withdraw(100);
        } catch (Exception e) {
            System.out.println("Amount should be greater than 0");
        }
    }
}
