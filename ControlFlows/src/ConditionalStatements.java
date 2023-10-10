import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        // if else
        // -----------
        int temprature = 30;
        if(temprature > 30)
            System.out.println("Sunny day. Drink plenty of water");
        else if(temprature > 20)
            System.out.println("Nice day");
        else 
            System.out.println("Cold day");

        // Simplified if else
        // ----------------------
        int income = 120_000;
        boolean hasHightIncome = true;
        if(income < 100_000) hasHightIncome = false;

        System.out.println(hasHightIncome);

        // Turnary operator
        // -------------------------
        String className = income > 100_000 ? "First class" : "Second class";
        System.out.println(className);

        // Switch case
        // -------------------
        String role = "admin";
        switch(role) {
            case "admin":
                System.out.println("You are an admin");
                break;
            case "moderator":
                System.out.println("You are a moderator");
                break;
            default: 
                System.out.println("You are guest");
        }

        // For loop
        // -----------------
        for(int i = 0; i < 5; i++)
            System.out.println("Hello World "+ i);

        // While loop
        // --------------------
        Scanner scan = new Scanner(System.in);
        String input = "";
        // while(true){
        //     input = scan.nextLine().toLowerCase();
        //     if(input.equals("pass"))
        //         continue; // return back to the begining of loop
        //     if(input.equals("quit")) 
        //         break; // break and exit the loop
        //     System.out.println(input);
        // }

        // Do while loop
        // --------------------
        // do{
        // input = scan.nextLine().toLowerCase();
        // System.out.println(input);
        // }while(!input.equals("quit"));

        // For each loop
        // -------------------
        String[] fruits = {"Apple", "Mango", "Orange"};
        for(String fruit : fruits)
           System.out.println(fruit); 
    }
}
