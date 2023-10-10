package BoundedGenerics;

public class Main {
    public static void main(String[] args) {
        GenericList<Integer> numbers = new GenericList<>();
        numbers.add(1); // boxing
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers.toString());
        System.out.println(numbers.get(0)); // unboxing
    }
}
