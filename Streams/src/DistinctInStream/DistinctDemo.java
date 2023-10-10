package DistinctInStream;

import java.util.List;

public class DistinctDemo {
    public static void main(String[] args) {
        var movies = List.of(
            new Movie("a", 10),
            new Movie("b", 15),
            new Movie("c", 20),
            new Movie("d", 10)
        );

        // with out distinct
        movies.stream()
              .map(Movie::getLikes)
              .forEach(likes -> System.out.println(likes));

        // with distinct
        movies.stream()
              .map(Movie::getLikes)
              .distinct()
              .forEach(likes -> System.out.println(likes));
    }
}
