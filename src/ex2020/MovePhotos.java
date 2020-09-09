package ex2020;

import java.io.File;

public class MovePhotos {
    public static void main(String[] args) {
        try {
            final File myFile = new File("C:\\Users\\JohnSmith\\Desktop\\facultate\\spinu\\SPOILER_grila7.png");
            if(myFile.renameTo(new File("C:\\Users\\JohnSmith\\Desktop\\da" + myFile.getName()))) {
                System.out.println("File is moved successful!");
            } else {
                System.out.println("File is failed to move!");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
