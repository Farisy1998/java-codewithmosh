package SlicingStream;

import java.util.List;

public class SlicingStreamDemo {
    public static void main(String[] args) {
        var movies = List.of(
                        new Movie("a", 10),
                        new Movie("b", 15),
                        new Movie("c", 20)
                    );
        
        // with skip()
        movies.stream()
              .skip(2)
              .forEach(movie -> System.out.println(movie.getTitle()));
    
        // with limit()
        movies.stream()
              .limit(2)
              .forEach(movie -> System.out.println(movie.getTitle()));

        // with takeWhile()
        movies.stream()
              .takeWhile(movie -> movie.getLikes() < 20)
              .forEach(movie -> System.out.println(movie.getTitle()));

        // with dropWhile()
        movies.stream()
              .dropWhile(movie -> movie.getLikes() > 20)
              .forEach(movie -> System.out.println(movie));

        // Note: The takeWhile() and dropWhile() methods will
        // execute util the condition become false.
    }
}
