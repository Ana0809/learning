package problem3;

import java.io.File;
import java.util.Scanner;

public class VerificaDacaExista {
    public static void Verifica() {
        while (true) {
            System.out.println("Introdu fisier");
            Scanner keyboard = new Scanner(System.in);
            File files = new File(keyboard.nextLine());
            //C:\\Users\\JohnSmith\\Documents\\Test.txt
            if (files.exists()) {
                System.out.println("Exista");
                break;
            } else
                System.out.println("Nu exista fisierul, path-ul este gresit");
        }
    }
}

