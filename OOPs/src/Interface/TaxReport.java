package Interface;

public class TaxReport {
    TaxCalculator calculator;

    // constructor injection
    public TaxReport(TaxCalculator calculator){
        this.calculator = calculator;
    }

    // setter injection
    public void setCalculator(TaxCalculator calculator){
        this.calculator = calculator;
    }

    public void showReport(){
        System.out.println(calculator.calculateTax());
    }
}
