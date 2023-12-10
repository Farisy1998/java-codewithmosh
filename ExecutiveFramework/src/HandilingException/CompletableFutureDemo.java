package HandilingException;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
    public static void doTask() {
        var future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting the current weather");
            throw new IllegalStateException();
        });
        
        try {
            // throw the exception
            // future.get();

            // return a default weather value instead of throwing exception
            var result = future
                .exceptionally(ex -> 1)
                .get();

            System.out.println(result);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
