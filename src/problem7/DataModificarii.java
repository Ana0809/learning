package problem7;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DataModificarii {
    public static void Data() {
        while (true) {
            System.out.println("Introdu fisier");
            Scanner keyboard = new Scanner(System.in);
            File files = new File(keyboard.nextLine());
            SimpleDateFormat data = null;
            try {
                if (files.exists()) {
                    data = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                }
                System.out.println("After Format : " + data.format(files.lastModified()));
                break;
            } catch (Exception e) {
                System.out.println("Path ul nu este corect, introduceti altul!");
            }
        }
    }
}