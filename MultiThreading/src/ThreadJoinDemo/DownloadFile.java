package ThreadJoinDemo;

public class DownloadFile implements Runnable {

    @Override
    public void run() {
        System.out.println("Downloading file - " + Thread.currentThread().getName());

        // To pause a thread we use sleep()
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Download completed - " + Thread.currentThread().getName());
    }
    
}
