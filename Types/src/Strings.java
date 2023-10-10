public class Strings {
    public static void main(String[] args) {
        // In java strings are inmuabe (means cannot change)

        String message = "  Hello World !!  ";
        System.out.println(message.startsWith("H"));
        System.out.println(message.endsWith("H"));
        System.out.println(message.replace("Hello", "Hi")); // returns a new string with out modifying the string
        System.out.println(message);
        System.out.println(message.toLowerCase()); // returns new string
        System.out.println(message.toUpperCase()); // returns new string
        System.out.println(message.trim());
    }
}
