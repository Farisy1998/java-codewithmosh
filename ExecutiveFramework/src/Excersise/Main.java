package Excersise;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var startTime = LocalTime.now();
        FlightService service = new Flight();
        List<CompletableFuture<Void>> futures = service
            .getQuotes()
            .map(future -> future.thenAccept(System.out::println))
            .collect(Collectors.toList());

        CompletableFuture
            .allOf(futures.toArray(new CompletableFuture[0]))
            .thenRun(() -> {
                var endTime = LocalTime.now();
                var duration = Duration.between(startTime, endTime);
                System.out.println("Retrived all qoutes in " + duration.toMillis() + " msec");
            });
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
