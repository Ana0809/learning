package problem3;
import java.io.File;
import java.util.Scanner;

public class VerificaDacaExista{

public static void Verifica(){
        System.out.println("Introdu fisier");
        Scanner keyboard = new Scanner(System.in);
        File files = new File(keyboard.nextLine());
       //C:\\Users\\JohnSmith\\Documents\\Test.txt
        if (files.exists()){
            System.out.println("Exista");
        }else{
            System.out.println("Nu exista");
        }
    }
}
