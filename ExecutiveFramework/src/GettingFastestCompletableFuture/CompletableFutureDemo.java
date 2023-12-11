package GettingFastestCompletableFuture;

import java.util.concurrent.CompletableFuture;
import AsyncronousAPI.LongTask;

public class CompletableFutureDemo {
    public static void doTask () {
        // getting the current weather from the fastest server
        var first = CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 20;
        });

        var second = CompletableFuture.supplyAsync(() -> 30);

        CompletableFuture
            .anyOf(first, second)
            .thenAccept(temp -> System.out.println(temp));
    }
}
