package SolutionsOnConcurrencyIssues.AtomicObjects;

import java.util.concurrent.atomic.AtomicInteger;

public class DownloadStatus {
    private AtomicInteger totalBytes = new AtomicInteger();
    // while using Atomic objects they are doing a single operation
    // by swapping a mechanism between expected and current values.

    public int getTotalBytes() {
        return totalBytes.get();
    }

    public void incrementTotalBytes() {
        totalBytes.incrementAndGet();
    }
}
