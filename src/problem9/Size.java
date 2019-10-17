package problem9;

import java.io.File;
import java.util.Scanner;

public class Size {

    public static void Kb(){
        System.out.println("Introdu fisier");
        Scanner keyboard = new Scanner(System.in);
        File files = new File(keyboard.nextLine());
        //C:\\Users\\JohnSmith\\Documents\\Test.txt
        long filesSize = files.length();
        System.out.println("File size in bytes is : " + filesSize);
        System.out.println("File size in KB is : " + (double)filesSize/1024);
        System.out.println("File size in MB is : " + (double)filesSize/(1024*1024));
    }
}
