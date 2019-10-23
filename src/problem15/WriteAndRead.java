package problem15;

import java.io.*;
import java.util.Scanner;

public class WriteAndRead {
    public static void Read() {
        while (true) {
            System.out.println("Introduceti fisier");
            try {
                Scanner keyboard = new Scanner(System.in);
                FileReader files = new FileReader(keyboard.nextLine());
                int i;
                while ((i = files.read()) != -1)
                    System.out.print((char) i);
break;
            } catch (Exception e) {
                System.out.println("Nu exista fisierul, path-ul este gresit");
            }
        }
    }
    public static void Write(){
        Scanner keyboard2 = new Scanner(System.in);
        PrintWriter out = null;
        try {
            System.out.println();
            System.out.println("Intorduceti text, cuvantul GATA opreste introducerea textului");
            out = new PrintWriter(keyboard2.nextLine());
            while (true) {
                String v = keyboard2.nextLine();
                out.println(v);
                if (v.endsWith("GATA")) {
                    System.out.println();
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Path ul nu este corect, introduceti altul!");
        } finally {
            out.close();
        }
    }

}