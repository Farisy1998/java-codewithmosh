package MyTube;

public class Main {
    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("VID-1");
        video.setTitle("Harry Potter");
        video.setUser(new User("john123@gmial.com"));

        var processor = new VideoProcessor(
                            new VideoEncoder(), 
                            new SQLVideoDatabase(), 
                            new EmailService()
                        );
        processor.process(video);
    }
}
