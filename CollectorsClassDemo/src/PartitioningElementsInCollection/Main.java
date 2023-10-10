package PartitioningElementsInCollection;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var movies = List.of(
                        new Movie("a", 10, Genre.Thriller),
                        new Movie("b", 15, Genre.Action),
                        new Movie("c", 20, Genre.Action)
        );

        var result = movies.stream().collect(Collectors.partitioningBy(m -> m.getLikes() > 10));
        System.out.println(result);
        
        var resultInStringOfName = movies.stream()
                                        .collect(Collectors.partitioningBy(
                                            m -> m.getLikes() > 10, 
                                            Collectors.mapping(
                                                Movie::getTitle, 
                                                Collectors.joining(","))) );

        System.out.println(resultInStringOfName);
    }
}
