package ex2020;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MovePhotos2 {
    public static void main(String[] args) {
        try {
            Path source = Paths.get("C:\\Users\\JohnSmith\\Desktop\\facultate\\spinu\\SPOILER_grila5.png");
            Path dest = Paths.get("C:\\\\Users\\\\JohnSmith\\\\Documents\\na.jpg");
            Files.move(source, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
