package Excersise;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public interface FlightService {
    Stream<CompletableFuture<Quote>> getQuotes();
    CompletableFuture<Quote> getQuote(String site);
}
