package ThreadInterruptDemo;

public class DownloadFile implements Runnable {

    @Override
    public void run() {
        System.out.println("Downloading file - " + Thread.currentThread().getName());

        for(int i = 0; i< Integer.MAX_VALUE; i++) {
            if(Thread.currentThread().isInterrupted()) return;
            System.out.println("Downloading Byte " + i);
        }

        System.out.println("Download completed - " + Thread.currentThread().getName());
    }
    
}
