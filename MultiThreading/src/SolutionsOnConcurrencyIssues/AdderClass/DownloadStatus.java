package SolutionsOnConcurrencyIssues.AdderClass;

import java.util.concurrent.atomic.LongAdder;

public class DownloadStatus {
    private LongAdder totalBytes = new LongAdder();
    // Internally this adder class uses an array of cells that store
    // partial sums, and adds them together when the final sum is needed.
    // It is faster than Atomic classes.
    
    public int getTotalBytes() {
        return totalBytes.intValue();
    }

    public void incrementTotalBytes() {
        totalBytes.increment();
    }
}
