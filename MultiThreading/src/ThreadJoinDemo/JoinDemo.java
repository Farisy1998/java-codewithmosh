package ThreadJoinDemo;

public class JoinDemo {
    public static void main(String[] args) {
        var thread = new Thread(new DownloadFile());
        thread.start();

        try {
            thread.join(); // join() will block the main  thread
                           // until the current thread gots completed
                           // it's execution
        }catch(InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("File is ready to scan");

    }
}
