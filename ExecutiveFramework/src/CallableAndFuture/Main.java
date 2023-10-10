package CallableAndFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        var executor = Executors.newFixedThreadPool(2);

        try{
            var future = executor.submit(() -> {
                var result =LongTask.simulate();

                System.out.println(Thread.currentThread().getName());
                
                return result;
            });
            // the value of the future object will be computed will be
            // in future.

            System.out.println("Do more work");

            // try {
            //     Thread.sleep(3000);
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }

            try {
                var result = future.get(); // when we call the get(), the get() will
                // block the current thread until the threads in the thread pool
                // execute the future object and returns the value.

                System.out.println(result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        finally {
            executor.shutdown();
        }
    }
}
