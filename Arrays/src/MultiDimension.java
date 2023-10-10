import java.util.Arrays;

public class MultiDimension{
    public static void main(String[] args) {
        // One way of declaration
        // int[][] numbers = new int[2][3];
        // numbers[0][0] = 1;
        // numbers[0][1] = 2;

        // Another way of declaration
        int[][] numbers = { {1, 2, 3}, {4, 5, 6} }; // 2X3
        System.out.println(Arrays.deepToString(numbers));
    }
}