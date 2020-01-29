package digitalLibrary;

public class Video extends  MediaEntity{
    int duration;
    String fullHD;
    Video(int duration, String fullHD,String type,String title, int noOfDownloads){
        super(type,title,noOfDownloads);
        this.duration=duration;
        this.fullHD=fullHD;
    }
}
