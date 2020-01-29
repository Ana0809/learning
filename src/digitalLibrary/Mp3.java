package digitalLibrary;

public class Mp3 extends MediaEntity {
    String singer;
    String album;

    Mp3(String singer, String album,String type,String title, int noOfDownloads) {
        super(type,title,noOfDownloads);
        this.singer = singer;
        this.album = album;
    }

}
