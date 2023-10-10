package AsyncronousAPI;

public class Main {
    public static void main(String[] args) {
        var service = new MailService();
        service.sendAsync();
        System.out.println("Do more Work");
    }
}
