package SolutionsOnConcurrencyIssues.SyncronizedCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> collection = Collections
                .synchronizedCollection(new ArrayList<>());
        // In a syncronized aollection all methods inside
        // the collection class are syncronized

        var thread0 = new Thread(() -> {
            collection.addAll(Arrays.asList(1, 2, 3));
        });
        var thread1 = new Thread(() -> {
            collection.addAll(Arrays.asList(4, 5, 6));
        });

        thread0.start();
        thread1.start();

        try {
            thread0.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(collection);
    }
}
