package CompletableFuture;

import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Runnable task0 = () -> System.out.println("a");

        // if we didn't want to return any value we use runAsync()
        var future0 = java.util.concurrent.CompletableFuture.runAsync(task0);
        // If we didn't supplied any executor to the runAsync().
        // The task will be run in a common pool defaultly by JVM.

        Supplier<Integer> task1 = () -> 1;
        // If we want to return a value, we use supplyAsync()
        var future1 = java.util.concurrent.CompletableFuture.supplyAsync(task1);

        try {
            var result = future1.get();

            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
