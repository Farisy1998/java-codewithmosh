package MyTube;

public class VideoProcessor {
    private VideoEncodable encoder;
    private VideoDatabase database;
    private NotificationService notificationService;

    public VideoProcessor(VideoEncodable encoder, 
                          VideoDatabase database, 
                          NotificationService notificationService
                          ){
        this.encoder = encoder;
        this.database = database;
        this.notificationService = notificationService;
    }

    public void process(Video video){
        encoder.encodeVideo(video);
        database.storeVideo(video);
        notificationService.notify(video.getUser());
    }
}
