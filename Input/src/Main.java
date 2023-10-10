import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scan.nextLine().trim();
        System.out.println("You are: "+name);
    }
}
