package digitalLibrary;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        adaugareInLibrarie(library);
        library.archive.sort(new CustomComparator());
        videoEntity(library);
        creareTop20(library);
        update(library, "Book12", 100);
        System.out.println();
        show(library.archive);
        System.out.println();
        show(library.top20);
    }

    private static void videoEntity(Library library) {
        System.out.println("all the media entities that are of type video");
        for (int i = 0; i < library.archive.size(); i++) {
            if (library.archive.get(i).getType().equals("Video"))
                System.out.println(library.archive.get(i).getType() + " " + library.archive.get(i).getTitle());
        }
    }

    private static void creareTop20(Library library) {
        for (int i = 0; i < 20; i++) {
            library.top20.add(library.archive.get(i));
        }
    }

    private static void show(ArrayList<MediaEntity> arrayL) {
        for (int i = 0; i < arrayL.size(); i++) {
            System.out.println(arrayL.get(i).getTitle() + " " + arrayL.get(i).getNoOfDownloads());
        }
    }

    private static void update(Library library, String titlu, int nouDownload) {
        System.out.println("Update");
        library.top20.removeAll(library.top20);
        for (int i = 0; i < library.archive.size(); i++) {
            if (library.archive.get(i).getTitle().equals(titlu)) {
                library.archive.get(i).setNoOfDownloads(nouDownload);
            }
        }
        library.archive.sort(new CustomComparator());
        creareTop20(library);

    }

    private static void adaugareInLibrarie(Library library) {
        Book book1 = new Book("Mircea", "Editura1", "Book", "Book1", 2);
        Book book2 = new Book("Marcel", "Editura1", "Book", "Book2", 5);
        Book book3 = new Book("Mihaela", "Editura13", "Book", "Book3", 20);
        Book book4 = new Book("Miruna", "Editura13", "Book", "Book4", 60);
        Book book5 = new Book("Miranda", "Editura15", "Book", "Book5", 21);
        Book book6 = new Book("Madlena", "Editura14", "Book", "Book6", 22);
        Book book7 = new Book("Madalina", "Editura1", "Book", "Book7", 23);
        Book book8 = new Book("Maricica", "Editura6", "Book", "Book8", 24);
        Book book9 = new Book("Mihai", "Editura1", "Book", "Book9", 28);
        Book book10 = new Book("Mirel", "Editura16", "Book", "Book10", 80);
        Book book11 = new Book("Marcelino", "Editura1", "Book", "Book11", 90);
        Book book12 = new Book("Misu", "Editura18", "Book", "Book12", 80);
        Book book13 = new Book("Micutu", "Editura1", "Book", "Book13", 79);
        Book book14 = new Book("Mirabela", "Editura9", "Book", "Book14", 209);
        Book book15 = new Book("Maria", "Editura1", "book", "Book15", 25);

        Video video1 = new Video(5, "hd", "Video", "Video1", 6);
        Video video2 = new Video(7, "hd", "Video", "Video2", 7);
        Video video3 = new Video(9, "hd", "Video", "Video3", 8);
        Video video4 = new Video(50, "hd", "Video", "Video4", 9);
        Video video5 = new Video(5, "hd", "Video", "Video5", 1);

        Mp3 mp31 = new Mp3("Alina", "Vorbe", "Mp3", "Mp31", 4);
        Mp3 mp32 = new Mp3("Alina", "Soapte", "Mp3", "Mp32", 2);
        Mp3 mp33 = new Mp3("Diana", "Lala", "Mp3", "Mp33", 20);
        Mp3 mp34 = new Mp3("Alina", "Vorbe", "Mp3", "Mp34", 50);
        Mp3 mp35 = new Mp3("Mihaela", "Vorbe", "Mp3", "Mp35", 70);
        Mp3 mp36 = new Mp3("Alina", "Nanana", "Mp3", "Mp36", 3);
        Mp3 mp37 = new Mp3("Adina", "Vorbe", "Mp3", "Mp37", 55);


        library.archive.add(book1);
        library.archive.add(book2);
        library.archive.add(book3);
        library.archive.add(book4);
        library.archive.add(book5);
        library.archive.add(book6);
        library.archive.add(book7);
        library.archive.add(book8);
        library.archive.add(book9);
        library.archive.add(book10);
        library.archive.add(book11);
        library.archive.add(book12);
        library.archive.add(book13);
        library.archive.add(book14);
        library.archive.add(book15);
        library.archive.add(video1);
        library.archive.add(video2);
        library.archive.add(video3);
        library.archive.add(video4);
        library.archive.add(video5);
        library.archive.add(mp31);
        library.archive.add(mp32);
        library.archive.add(mp33);
        library.archive.add(mp34);
        library.archive.add(mp35);
        library.archive.add(mp36);
        library.archive.add(mp37);
    }
}
