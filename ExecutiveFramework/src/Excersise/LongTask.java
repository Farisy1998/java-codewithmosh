package Excersise;

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

    public static int simulate(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            return 2;
        }
    }
}
