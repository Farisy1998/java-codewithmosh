package MortgageCalculator;

public class Main {

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("principal: ", 1000, 1_000_000);
        float annualInterestRate = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Periods (years): ", 1, 30);
    
        var calculator = new MortgageCalculator(principal, annualInterestRate, years);
        
        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
    }
    
}
