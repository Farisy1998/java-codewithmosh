public class MathFunctions {
    public static void main(String[] args) {
        System.out.println(Math.round(1.1));
        System.out.println(Math.min(1, 2));
        System.out.println(Math.max(10, 20));
        System.out.println(Math.ceil(1.1));
        System.out.println(Math.floor(1.1));
        System.out.println(Math.random());

        // To generate a random number between 1 - 100
        int value = (int) (Math.random() * 100);
        System.out.println(value);
    }
}
