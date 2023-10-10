package SimpleReducersInStream;

import java.util.List;

public class SimpleReducersDemo {
    public static void main(String[] args) {
        var movies = List.of(
            new Movie("a", 10),
            new Movie("b", 15),
            new Movie("c", 20)
        );

        // Reducres in stream will reduce a stream of objects
        // in top a single object or value

        System.out.println(movies.stream().count());
        System.out.println(movies.stream().anyMatch(m -> m.getLikes() > 20));
        System.out.println(movies.stream().allMatch(m -> m.getLikes() > 20));
        System.out.println(movies.stream().noneMatch(m -> m.getLikes() > 50));
        System.out.println(movies.stream().findFirst().get());
        System.out.println(movies.stream().findAny().get());
        System.out.println();
    }
}