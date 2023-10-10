package MyTube;

public class EmailService implements NotificationService {
    public void notify(String emailId){
        System.out.println("Email send");
    }
}
