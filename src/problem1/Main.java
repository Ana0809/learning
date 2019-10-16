package problem1;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File files = new File("C:\\Users\\JohnSmith");
        String[] array = files.list();
        if (array.length == 0) {
            System.out.println("The directory is empty");
        } else {
            for (int i =0; i<array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }
}
