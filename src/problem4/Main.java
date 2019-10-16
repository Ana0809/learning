package problem4;
import java.io.File;
public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\JohnSmith\\Documents\\Test.txt");
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
