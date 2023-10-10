package SolutionsOnConcurrencyIssues.ConcurrentCollection;

import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        var map = new ConcurrentHashMap<>();
        // the concurrent collections uses patitioning
        // to execute multiple threads concurrently on the
        // collection

        var thread0 = new Thread(() -> {
            map.put(1, "a");
            map.put(2, "b");
        });
        var thread1 = new Thread(() -> {
            map.put(3, "c");
            map.put(4, "d");
        });

        thread0.start();
        thread1.start();

        try {
            thread0.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(map);
    }
}
