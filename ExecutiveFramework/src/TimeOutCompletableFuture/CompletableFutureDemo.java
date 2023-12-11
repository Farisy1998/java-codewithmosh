package TimeOutCompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureDemo {
    public static void doTask () {
        var first = CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 1;
        });

        
        try {
            var result = first
                            .completeOnTimeout(
                                1, 1, TimeUnit.SECONDS)
                            .get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
