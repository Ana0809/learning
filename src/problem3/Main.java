package problem3;

import java.io.File;
public class Main {
    public static void main(String[] args) {
        File files = new File("C:\\Users\\JohnSmith\\Documents\\Test.txt");
        if (files.exists()){
            System.out.println("Exista");
        }else{
            System.out.println("Nu exista");
        }
    }
}
