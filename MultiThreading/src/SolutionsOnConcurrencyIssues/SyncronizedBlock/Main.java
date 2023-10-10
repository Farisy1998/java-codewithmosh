package SolutionsOnConcurrencyIssues.SyncronizedBlock;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        List<DownloadFile> tasks = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            var task = new DownloadFile();
            tasks.add(task);
            var thread = new Thread(task);
            thread.start();
            threads.add(thread);
        }

        for(var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        var totalBytes = tasks.stream()
             .map(t -> t.getStatus().getTotalBytes())
             .reduce(Integer::sum);
        
        System.out.println(totalBytes);
    }
}
