package problem1;

import java.io.File;
import java.util.Scanner;

public class Afisare {
    public static void Afis() {
        while (true) {
            System.out.println("Introduceti fisier");
            Scanner keyboard = new Scanner(System.in);
            File files = new File(keyboard.nextLine());
            // C:\\Users\\JohnSmith
            String[] array = files.list();
            try {
                if (array.length == 0) {
                    System.out.println("The directory is empty");
                } else {
                    for (int i = 0; i < array.length; i++) {
                        System.out.println(array[i]);
                    }
                    break;
                }

            } catch (Exception ex) {
                System.out.println("Path ul nu este corect, introduceti altul!");
            }
        }
    }
}
