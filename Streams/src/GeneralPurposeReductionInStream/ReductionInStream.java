package GeneralPurposeReductionInStream;

import java.util.List;

public class ReductionInStream {
    public static void main(String[] args) {
        var movies = List.of(
                        new Movie("a", 10), 
                        new Movie("b", 15), 
                        new Movie("c", 20)
                    );
        
        Integer sum = movies.stream()
              .map(m -> m.getLikes())
              .reduce(0, Integer::sum);
              
        System.out.println(sum);
    }
}
