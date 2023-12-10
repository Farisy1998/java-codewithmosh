package TransformingCompetableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
    private static int toFahrenheit(int celsius) {
        return (int) (celsius * 1.8) + 32;
    }

    public static void doTask() {
        //  Transforming celsius to fahrenheit
        CompletableFuture
            .supplyAsync(() -> 30)
            .thenApply(CompletableFutureDemo::toFahrenheit)
            .thenAccept(f -> System.out.println(f));
    }
}
