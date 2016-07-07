package socialmedia;

public class YouTubeVideoAdapter implements SocialMediaEntry {

    // Our adaptee
    YouTubeVideo video;

    // Constructor
    public YouTubeVideoAdapter(YouTubeVideo video) {
        this.video = video;
    }

    public String getUser() {
        return video.getAuthor();
    }

    public String getPostText() {
        return video.getTitle() + " - " + video.getDescription();
    }

    // Just for consistency
    public void setUser(String user) {
        video.setAuthor(user);
    }

}
