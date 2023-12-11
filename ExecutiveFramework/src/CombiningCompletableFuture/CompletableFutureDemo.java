package CombiningCompletableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
    public static void doTask() {
        // convert USD to euro

        // task 1
        var first = CompletableFuture
                        .supplyAsync(() -> "20USD")
                        .thenApply(usd -> {
                            var price = usd.replace("usd", "");
                            return Integer.parseInt(price);
                        });

        // task2
        var second = CompletableFuture.supplyAsync(() -> 0.9);

        first
            .thenCombine(second, (price, exchangeRate) -> price * exchangeRate)
            .thenAccept(euro -> System.out.println(euro));
    }
}
