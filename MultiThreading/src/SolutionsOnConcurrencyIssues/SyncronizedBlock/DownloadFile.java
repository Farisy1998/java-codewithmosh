package SolutionsOnConcurrencyIssues.SyncronizedBlock;

public class DownloadFile implements Runnable {
    private DownloadStatus status;
    
    public DownloadFile() {
        this.status = new DownloadStatus();
    }
    
    @Override
    public void run() {
        System.out.println("Downloading file - " + Thread.currentThread().getName());
        
        for(int i = 0; i< 10_000; i++) {
            status.incrementTotalBytes();
        }
        
        System.out.println("Download completed - " + Thread.currentThread().getName());
    }

    public DownloadStatus getStatus() {
        return status;
    }
}
