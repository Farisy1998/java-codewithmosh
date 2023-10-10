package SolutionsOnConcurrencyIssues.SyncronizedBlock;

public class DownloadStatus {
    private int totalBytes;
    private Object totalBytesMonitorObj = new Object();

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        synchronized(totalBytesMonitorObj) {
            totalBytes++;
        }
    }
}
