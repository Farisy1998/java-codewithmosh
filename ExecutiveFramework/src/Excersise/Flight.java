package Excersise;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class Flight implements FlightService {
    public Stream<CompletableFuture<Quote>> getQuotes () {
        var list = List.of("site1", "site2", "site3");

        return list.stream().map(this::getQuote);
    }

    public CompletableFuture<Quote> getQuote (String site) {
        System.out.println("Getting qoute from " + site);
        Random number = new Random();

        LongTask.simulate(1_000 + number.nextInt(2_000));

        var price = 100 + number.nextInt(10);
        return CompletableFuture.supplyAsync(() -> new Quote(site, price));
    }
}
