package FilteringStream;

import java.util.List;
import java.util.function.Predicate;

public class FilteringStreamDemo {
    public static void main(String[] args) {
        var movies = List.of(
                        new Movie("a", 10), 
                        new Movie("b", 15), 
                        new Movie("c", 20)
                    );
        Predicate<Movie> isPopular = movie -> movie.getLikes() > 10;

        movies.stream()
              .filter(isPopular)
              .forEach(movie -> System.out.println(movie));
    }
}
