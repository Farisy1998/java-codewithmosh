package CollectorsDemo;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        var movies = List.of(
                        new Movie("a", 10),
                        new Movie("b", 15),
                        new Movie("c", 20)
        );

        // converting to List
        var list = movies.stream()
              .filter(m -> m.getLikes() > 10)
              .collect(Collectors.toList());
        
        System.out.println(list);

        // converting to set
        var set = movies.stream()
                    .filter(m -> m.getLikes() > 10)
                    .collect(Collectors.toList());

        System.out.println(set);

        // converting to map
        var map = movies.stream()
                    .filter(m -> m.getLikes() > 10)
                    .collect(Collectors.toMap(Movie::getTitle, Movie::getLikes));
    
        System.out.println(map);

        // getting movie object as value in map
        var movieObj = movies.stream()
                        .filter(m -> m.getLikes() > 10)
                        .collect(Collectors.toMap(Movie::getTitle, m -> m));

        System.out.println(movieObj);


        // summing the number of likes of all movies
        var sumOfLikes = movies.stream()
                            .collect(Collectors.summingInt(m -> m.getLikes()));

        System.out.println(sumOfLikes);

        // getting the statistics of the list of movies
        var statistics = movies.stream()
                            .filter(m -> m.getLikes() > 10)
                            .collect(Collectors.summarizingInt(Movie::getLikes));

        System.out.println(statistics);

        // using delimiter
        var moviesWithName = movies.stream()
                                .map(m -> m.getTitle())
                                .collect(Collectors.joining(","));

        System.out.println(moviesWithName);


    }
}