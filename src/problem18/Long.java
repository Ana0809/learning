package problem18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Long {
    public static void Word(ArrayList<String> myList) {
        while (true) {
            try {
                System.out.println();
                Scanner sc = getScannerFisiere2("Introdu fisierul ");
                while (sc.hasNextLine()) {
                    myList.add(sc.nextLine());
                }
                System.out.println("Cel mai lung cuvant este este ");

                    System.out.println(Collections.max(myList));

                break;
            } catch (FileNotFoundException e) {
                System.out.println("Nu exista fisierul, path-ul este gresit");
            }
        }
    }

    public static Scanner getScannerFisiere2(String s) throws FileNotFoundException {
        System.out.println(s);
        Scanner keyboard = new Scanner(System.in);
        File file = new File(keyboard.nextLine());
        return new Scanner(file);
    }
}