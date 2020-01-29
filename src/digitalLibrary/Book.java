package digitalLibrary;

public class Book extends MediaEntity{
    String author;
    String publishingHouse;

    Book(String author,String publishingHouse, String type,String title, int noOfDownloads){
        super(type, title, noOfDownloads);
        this.author=author;
        this.publishingHouse=publishingHouse;
    }
}
