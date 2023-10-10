package MyTube;

public class SQLVideoDatabase implements VideoDatabase {

    @Override
    public void storeVideo(Video video) {
        System.out.println("Video stored");
    }
    
}
