package MortgageCalculator;

import java.util.Scanner;

public class Console {
    private static Scanner scan = new Scanner(System.in);

    public static double readNumber(String prompt){
        double value = scan.nextDouble();
        return value;
    }

    public static double readNumber(String prompt, double min, double max){
        double value;
    
        while(true){
            System.out.print(prompt);
            value = scan.nextDouble();
    
            if(value >= min && value <= max)
                break;
            
            System.out.println("Enter a number between "+min+" and "+max);
        }
    
        return value;
    }
    
}
