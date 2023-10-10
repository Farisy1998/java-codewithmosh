package CustomException;

public class Main {
    public static void main(String[] args) {
        var account = new Account();
        System.out.println(account.getBalance());
        try {
            account.withdraw(3000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
