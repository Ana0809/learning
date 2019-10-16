package problem4;
import java.io.File;
public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\JohnSmith\\Documents\\Test.txt");
        if(file.canRead()){
            System.out.println("Are permisiune de  citire");
        }
        if(file.canWrite()){
            System.out.println("Are permisiune de scriere");
        }
         else{ System.out.println("Nu are permisiune");  //e de ajuns sa nu se indeplineasca o cond ca sa nu aiba permisiune
        }
    }
}
