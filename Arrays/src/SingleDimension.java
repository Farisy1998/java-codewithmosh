import java.util.Arrays;

public class SingleDimension {
    public static void main(String[] args) throws Exception {
        // One way of declaring the array in java
        // int[] numbers = new int[5];
        // numbers[0] = 2;
        // numbers[1] = 4;
        // numbers[2] = 3;

        // Another declaration syntax (newer way)
        int[] numbers = {4, 2, 1, 3, 5};
        System.out.println(Arrays.toString(numbers));

        // to sort
        Arrays.sort(numbers); // sort and modifies the current array
        System.out.println(Arrays.toString(numbers));

        // Note:-
        // Arrays are fixed size in java. Once it is created,
        // it cannot be re-sized
    }
}
