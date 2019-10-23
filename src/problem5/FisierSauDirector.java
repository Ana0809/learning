package problem5;

import java.io.File;
import java.util.Scanner;

public class FisierSauDirector {
    public static void FisierDirector() {
        while (true) {
            System.out.println("Introdu fisier");
            Scanner keyboard = new Scanner(System.in);
            File files = new File(keyboard.nextLine());
            //C:\\Users\\JohnSmith\\Documents\\Test.txt
            if (files.isDirectory()) {
                System.out.println("Is Directory");
            } else if (files.isFile()) {
                System.out.println("Is File");
                break;
            } else {
                System.out.println("Path ul nu este corect, introduceti altul!");
            }

        }
    }
}
