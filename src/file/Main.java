package file;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // pass the path to the file as a parameter
        FileReader fr = new FileReader("C:\\Users\\JohnSmith\\Documents\\Test.txt");
        int i;
        while ((i = fr.read()) != -1)
            System.out.print((char) i);
        System.out.println("Path ul meu!");
    }
}
