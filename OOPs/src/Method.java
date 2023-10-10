public class Method {
    public static void main(String[] args) {
        String message1 = greetUser();
        System.out.println(message1);
        String message2 = greetUser("Salmanul", "Farisy K");
        System.out.println(message2);
    }

    public static String greetUser(){
        return "Hi";
    }

    // method overloading
    public static String greetUser(String firstName, String lastName){
        return "Hello "+firstName+" "+lastName;
    }
}
