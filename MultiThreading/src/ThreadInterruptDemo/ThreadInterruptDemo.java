package ThreadInterruptDemo;

public class ThreadInterruptDemo {
    public static void main(String[] args) {
        var thread = new Thread(new DownloadFile());
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // We can only interrupt a thread which is running state
        thread.interrupt();
    }
}
