package StreamsDemo;

import java.util.List;

public class StreamsDemo {
    public static void main(String[] args) {
        var movies = List.of(
            new Movie("a", 10),
            new Movie("b", 15),
            new Movie("c", 20)
        );

        // imperative programing
        int count = 0;
        for(var movie : movies)
            if(movie.getLikes() > 10)
                count++;
        System.out.println(count);

        // declarative programing
        var count2 = movies.stream()
                        .filter(movie -> movie.getLikes() > 10)
                        .count();
        System.out.println(count2);
    }
}