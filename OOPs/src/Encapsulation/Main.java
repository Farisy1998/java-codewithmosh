package Encapsulation;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000);
        System.out.println(employee.calculateWage(10));
        Employee.printNumberOfEmployees();
    }
}
