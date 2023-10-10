package MyTube;

public class VideoEncoder implements VideoEncodable {
    @Override
    public void encodeVideo(Video video){
        System.out.println("Video encoded");
    }
}
