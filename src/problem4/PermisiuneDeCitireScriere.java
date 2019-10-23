package problem4;

import java.io.File;
import java.util.Scanner;

public class PermisiuneDeCitireScriere {
    public static void CitireScriere() {
        while (true) {
            System.out.println("Introdu fisierul ");
            Scanner keyboard = new Scanner(System.in);
            File file = new File(keyboard.nextLine());
            if(file.exists()) {
                if (file.canWrite()) {

                    System.out.println("Are permisiune de scriere ");
                } else {
                    System.out.println("Nu are permisiune de scriere");
                }
                if (file.canRead()) {
                    System.out.println("Are permisiune de citire ");
                } else {
                    System.out.println("Nu are permisiune de citire ");
                }
                break;
            }else{
                System.out.print("Path ul nu este corect, introduceti altul!");

            }

        }
    }
}
