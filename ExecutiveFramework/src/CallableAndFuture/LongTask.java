package CallableAndFuture;

public class LongTask {
    public static int simulate() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            return 2;
        }
    }
}
