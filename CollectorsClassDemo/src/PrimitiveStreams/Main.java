package PrimitiveStreams;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(1, 5).forEach(System.out::println);
        IntStream.rangeClosed(1, 5).forEach(System.out::println);
    }
}
