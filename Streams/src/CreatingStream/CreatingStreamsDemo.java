package CreatingStream;

import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void main(String[] args) {
        // from collection
        Collection<Integer> collection = List.of(1, 2, 3, 4, 5);
        var count = collection.stream().count();
        System.out.println(count);
        
        // from array
        int[] array = {1, 2, 3, 5, 6, 7, 9, 10};
        var countOfEvenNumbers = Arrays.stream(array)
              .filter(n -> n % 2 == 0)
              .count();
        System.out.println(countOfEvenNumbers);

        // using generate()
        var numbers = Stream.generate(() -> Math.random());
        numbers.limit(3)
               .forEach(n -> System.out.println(n));

        // using iterator()
        var stream = Stream.iterate(1, n -> n + 1);
        stream.limit(10)
              .forEach(n -> System.out.println(n));

        // using Stream.of()
        var stream2 = Stream.of(1, 2, 3, 4, 5);
        var countOfOddNumbers = stream2.filter(n -> n%2 != 0)
               .count();
        System.out.println(countOfOddNumbers);
    }
}
