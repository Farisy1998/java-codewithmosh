package ComparatorInterace;

public class Customer implements Comparable<Customer> {
    private String name;
    private String email; 
    
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    @Override
    public int compareTo(Customer other) {
        return name.compareTo(other.name);
    }
    
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer: " + name;
    }
}
