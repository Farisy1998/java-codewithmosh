package ThreadDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.activeCount());
        System.out.println(Runtime.getRuntime().availableProcessors());

        for(var i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFile());
            thread.start();
            System.out.println(Thread.currentThread().getName());
        }
    }
}
