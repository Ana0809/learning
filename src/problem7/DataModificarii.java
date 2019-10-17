package problem7;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DataModificarii {
    public static void Data(){
        System.out.println("Introdu fisier");
        Scanner keyboard = new Scanner(System.in);
        File files = new File(keyboard.nextLine());
        //C:\\Users\\JohnSmith\\Documents\\Test.txt
        SimpleDateFormat data = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        System.out.println("After Format : " + data.format(files.lastModified()));
    }
    }