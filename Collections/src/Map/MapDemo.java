package Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Customer> customers = new HashMap<>();
        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");
        customers.put(c1.getEmail(), c1);
        customers.put(c2.getEmail(), c2);
        
        var customer = customers.get("e1");
        System.out.println(customer);

        var anotherCustomer = customers.get("e10");
        System.out.println(anotherCustomer);

        var unknown = new Customer("Unknown", "");
        var another = customers.getOrDefault("e10", unknown);
        System.out.println(another);

        var exists = customers.containsKey("e10");
        System.out.println(exists);

        // Iterating through a map
        for(var c : customers.values()) // by values
            System.out.println(c);

        for(var key : customers.keySet()) // by keys
            System.out.println(key);

        for(var entry : customers.entrySet()) // by entries
            System.out.println(entry);
    }
}
