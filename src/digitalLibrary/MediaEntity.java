package digitalLibrary;

public class MediaEntity {
    String type;
    String title;
    Integer noOfDownloads;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getNoOfDownloads() {
        return noOfDownloads;
    }

    public void setNoOfDownloads(Integer noOfDownloads) {
        this.noOfDownloads = noOfDownloads;
    }



    MediaEntity( String type,String title,int noOfDownloads){
        this.type=type;
        this.title=title;
        this.noOfDownloads=noOfDownloads;
    }


}
