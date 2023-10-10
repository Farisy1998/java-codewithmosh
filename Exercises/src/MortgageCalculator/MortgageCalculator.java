package MortgageCalculator;

public class MortgageCalculator {
    private final static int MONTHS_IN_YEAR = 12;
    private final static int PERCENT = 100;

    private int principal;
    private float annualInterestRate;
    private byte years;

    public MortgageCalculator(int principal, float annualInterestRate, byte years){
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.years = years;
    }

    public double calculateMortgage(){
        float monthlyInterestRate = getMonthlyInterestRate();
        short numberOfPayments = getNumberOfPayments();
        
        return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments) 
        / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));
    }

    public double calculateBalance(short numberOfPaymentsMade){
        float monthlyInterestRate = getMonthlyInterestRate();
        short numberOfPayments = getNumberOfPayments();
            
        double balance = principal 
                * (Math.pow(1 + monthlyInterestRate, numberOfPayments) - Math.pow(1 + monthlyInterestRate, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
                
                return balance;
    }

    public double[] getRemainingBalance(){
        double[] balances = new double[getNumberOfPayments()];

        for(short month = 1; month <= getNumberOfPayments(); month++){
            double balance = calculateBalance(month);
            balances[month - 1] = balance;
        }

        return balances;
    }
        
    private float getMonthlyInterestRate(){
        return (annualInterestRate / PERCENT) / MONTHS_IN_YEAR;
    }
        
    private short getNumberOfPayments(){
        return (short) (years * MONTHS_IN_YEAR);
    }
}
        