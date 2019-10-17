package problem2;

import java.io.File;
import java.util.Scanner;

public class FisierCuExtensie {
    public static void Extensie(){
        System.out.println("Introdu fisier");
        Scanner keyboard = new Scanner(System.in);
        File files = new File(keyboard.nextLine());
        // C:\\Users\\JohnSmith\\Documents
        String[] list = files.list();
        for (int i = 0; i < list.length; i++) {
            if (list[i].endsWith("txt")) {
                System.out.println(list[i]);
            }
        }
    }
}



