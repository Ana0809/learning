package problem5;

import java.io.File;
import java.util.Scanner;

public class FisierSauDirector {
    public static void FisierDirector(){
        System.out.println("Introdu fisier");
        Scanner keyboard = new Scanner(System.in);
        File files = new File(keyboard.nextLine());
        //C:\\Users\\JohnSmith\\Documents\\Test.txt
        if(files.isDirectory()) {
            System.out.println("Is Directory");
        }
            if(files.isFile()){
                System.out.println("Is File");
            }
        }
    }

