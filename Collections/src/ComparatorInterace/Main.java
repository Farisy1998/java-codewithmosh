package ComparatorInterace;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("b", "e3"));
        customers.add(new Customer("a", "e1"));
        customers.add(new Customer("c", "e2"));
        Collections.sort(customers, new EmailComparator());
        System.out.println(customers);
    }
}
