package problem17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Line {
        public static void First() {

            ArrayList<String> myList = new ArrayList<>();
            Scanner keyboard = new Scanner(System.in);
            double n;
            while (true) {
                try {
                    System.out.println("Introdu cate randuri vrei sa citesti");
                    n = keyboard.nextDouble();
                }
                catch (InputMismatchException e){
                    System.out.println("Introdu un numar");
                    keyboard.nextLine();
                    continue;
                }
                try {
                    Scanner sc = getScannerFisiere("Introdu fisierul  - ");
                    {
                        while (sc.hasNextLine()) {
                            myList.add(sc.nextLine());
                        }
                        for (int i = 0; i < n; i++) {
                            System.out.println(myList.get(i));
                        }

                        break;
                    }

                } catch (FileNotFoundException e) {
                    System.out.println("Mai incearca odata");
                }
            }
        }
    private static Scanner getScannerFisiere(String s) throws FileNotFoundException {
        System.out.println(s);
        Scanner keyboard = new Scanner(System.in);
        File file = new File(keyboard.nextLine());
        return new Scanner(file);
    }
}