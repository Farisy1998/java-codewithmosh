package MyTube;

public class Video {
    private String fileName;
    private String title;
    private User user;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public String getUser(){
        return user.getEmail();
    }

    
}
