package MapAndFlapMapInStream;

import java.util.List;

public class MapDemo {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
            new Movie("a", 10),
            new Movie("b", 15),
            new Movie("c", 20)
        );

        movies.stream()
              .map(movie -> movie.getTitle())
              .forEach(title -> System.out.println(title));
    }
}
