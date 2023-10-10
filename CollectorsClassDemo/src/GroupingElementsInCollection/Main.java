package GroupingElementsInCollection;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var movies = List.of(
                        new Movie("a", 10, Genre.Thriller),
                        new Movie("b", 15, Genre.Action),
                        new Movie("c", 20, Genre.Action)
        );

        // group by genre
        var resultInList = movies.stream()
                            .collect(  
                                Collectors.groupingBy(
                                    Movie::getGenre));
        System.out.println(resultInList);

        // another version of the grouping by method which groups
        // the movies based on genre to set
        var resultInSet = movies.stream()
                                .collect(
                                    Collectors.groupingBy(
                                        Movie::getGenre, 
                                        Collectors.toSet()));
        System.out.println(resultInSet);

        //counting
        var count = movies.stream()
                        .collect(
                            Collectors.groupingBy(
                                Movie::getGenre, 
                                Collectors.counting()));
        System.out.println(count);

        // joining
        var stringOfMoveTitle = movies.stream()
                .collect(Collectors
                    .groupingBy(
                        Movie::getGenre, 
                        Collectors.mapping(
                            Movie::getTitle, 
                            Collectors.joining(","))));
        System.out.println(stringOfMoveTitle);
    }
}
