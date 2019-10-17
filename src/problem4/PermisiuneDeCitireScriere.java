package problem4;
import java.io.File;
import java.util.Scanner;

public class PermisiuneDeCitireScriere {
    public static void CitireScriere(){
        System.out.println("Introdu fisier");
        Scanner keyboard = new Scanner(System.in);
        File file = new File(keyboard.nextLine());
      //C:\\Users\\JohnSmith\\Documents\\Test.txt
        if(file.canRead()){
            System.out.println("Are permisiune de citire");
        }else{
            System.out.println("Nu are permisiune de citire");
        }
        if(file.canWrite()){
            System.out.println("Are permisiune de scriere");
        }
         else{ System.out.println("Nu are permisiune de scriere");
        }
    }
}
