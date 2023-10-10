package SolutionsOnConcurrencyIssues.VolatileKeyword;

public class Main {
    public static void main(String[] args) {
        var status = new DownloadStatus();

        var thread0 = new Thread(new DownloadFile(status));
        var thread1 = new Thread(() -> {
            while(!status.isDone()) {}
            System.out.println(status.getTotalBytes());
        });

        thread0.start();
        thread1.start();
    }
}
