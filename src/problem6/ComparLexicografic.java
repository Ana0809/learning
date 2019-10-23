package problem6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ComparLexicografic {
    public static void PopulateListAndShowing(ArrayList<String> myList) {
        while (true) {
            try {
                System.out.println();
                Scanner sc = getScannerFisiere("Introdu fisierul pentru comparare ");
                while (sc.hasNextLine()) {
                    myList.add(sc.nextLine());
                }
                System.out.println("Continutul fisierului este ");

                for (int i = 0; i < myList.size(); i++) {

                    System.out.print(" : " + myList.get(i));
                }
                break;
            } catch (FileNotFoundException e) {
                System.out.println("Reintrodu alt path");
            }
        }
    }


    public static void printingResults(ArrayList<String> myList, ArrayList<String> myList2) {
        System.out.println();
        if (myList.equals(myList2)) {
            System.out.println("Liste egale");
            return;
        } else {
            System.out.println("Listele nu sunt egale");
            return;
        }
    }

    public static Scanner getScannerFisiere(String s) throws FileNotFoundException {
        System.out.println(s);
        Scanner keyboard = new Scanner(System.in);
        File file = new File(keyboard.nextLine());
        return new Scanner(file);
    }

}
