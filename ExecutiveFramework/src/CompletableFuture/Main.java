package CompletableFuture;

import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Completable Future is an interface
        // Completable future inherits the Future and Completion Stage interfaces

        Runnable task0 = () -> System.out.println("a");

        // running an async operation
        var future0 = java.util.concurrent.CompletableFuture.runAsync(task0);
        
        // after the above async operation we need to do some other task
        future0.thenRun(() -> {
            System.out.println(Thread.currentThread().getName());
        });

        // future0.thenRunAsync(() -> {
        //     System.out.println(Thread.currentThread().getName());
        // });
    

        Supplier<Integer> task1 = () -> 1;
        var future1 = java.util.concurrent.CompletableFuture.supplyAsync(task1);

        try {
            var result = future1.get();

            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
