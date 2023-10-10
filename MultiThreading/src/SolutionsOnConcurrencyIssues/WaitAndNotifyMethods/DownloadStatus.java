package SolutionsOnConcurrencyIssues.WaitAndNotifyMethods;

public class DownloadStatus {
    private boolean isDone; // we are informing the JVM that
        // this isDone flag is a unstable flag and the value stored
        // in the flag will be change. Or this flag is a volatile one.
    private int totalBytes;
    
    public int getTotalBytes() {
        return totalBytes;
    }
    
    public void incrementTotalBytes() {
        totalBytes++;
    }

    public boolean isDone() {
        return isDone;
    }
    
    public void setDone() {
        this.isDone = true;
    }
}
