package problem1;

import java.io.File;
import java.util.Scanner;

public class Afisare {
    public static void Afis(){
        System.out.println("Introdu fisier");
        Scanner keyboard = new Scanner(System.in);
        File files = new File(keyboard.nextLine());
       // C:\\Users\\JohnSmith
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
