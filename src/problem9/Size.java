package problem9;

import java.io.File;
import java.util.Scanner;

public class Size {
    public static void Kb() {
        while (true) {
            System.out.println("Introdu fisier");
            Scanner keyboard = new Scanner(System.in);
            File files = new File(keyboard.nextLine());
            //C:\\Users\\JohnSmith\\Documents\\Test.txt
            long filesSize = files.length();
            if (filesSize == 0) {
                System.out.println("Path ul nu este corect, introduceti altul!");
            } else {
                System.out.println("File size in bytes is : " + filesSize);
                System.out.println("File size in BK is : " + (double) filesSize / 1024);
                System.out.println("File size in MB is : " + (double) filesSize / (1024 * 1024));
break;
            }
        }
    }
}