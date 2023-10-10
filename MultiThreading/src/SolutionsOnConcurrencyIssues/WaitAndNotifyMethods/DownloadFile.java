package SolutionsOnConcurrencyIssues.WaitAndNotifyMethods;

public class DownloadFile implements Runnable {
    private DownloadStatus status;
    
    public DownloadFile(DownloadStatus status) {
        this.status = status;
    }
    
    @Override
    public void run() {
        System.out.println("Downloading file - " + Thread.currentThread().getName());
        
        for(int i = 0; i< 1_000_000; i++) {
            status.incrementTotalBytes();
        }

        status.setDone();
        synchronized(status) {
            status.notify();
        }
        
        System.out.println("Download completed - " + Thread.currentThread().getName());
    }

    public DownloadStatus getStatus() {
        return status;
    }
}
