package Encapsulation;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    public static int numberOfEmployees; // static field

    // constructor
    public Employee(int baseSalary){
        this(baseSalary, 0);
    }
    
    // constructor overloading
    public Employee(int baseSalary, int hourlyRate){
        this.baseSalary = baseSalary;
        this.hourlyRate = hourlyRate;
        Employee.numberOfEmployees++;
    }

    public static void printNumberOfEmployees(){
        System.out.println(Employee.numberOfEmployees);
    }

    private void setBaseSalary(int baseSalary){
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary(){
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate){
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate(){
        return hourlyRate;
    }

    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }
    
}
