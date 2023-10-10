package SortingStrem;

import java.util.Comparator;
import java.util.List;

public class SortingStreamDemo {
    public static void main(String[] args) {
        var movies = List.of(
                        new Movie("c", 10),
                        new Movie("b", 15),
                        new Movie("a", 20)
                    );

        // Forward sorting
        movies.stream()
            .sorted(Comparator.comparing(Movie::getTitle))
            .forEach(movie -> System.out.println(movie.getTitle()));

        // backward sorting
        movies.stream()
            .sorted(Comparator.comparing(Movie::getTitle).reversed())
            .forEach(movie -> System.out.println(movie.getTitle()));
    }
}
