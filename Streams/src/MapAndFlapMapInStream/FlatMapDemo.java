package MapAndFlapMapInStream;

import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {
    public static void main(String[] args) {
        //Stream<List<Integer>>
        var streamOfLists = Stream.of(
                    List.of(1, 2, 3, 4), 
                    List.of(5, 6, 7, 8));

        streamOfLists
                .flatMap(list -> list.stream())
                .forEach(n -> System.out.println(n));
    }
}
