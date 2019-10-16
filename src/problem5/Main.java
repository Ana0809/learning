package problem5;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File files = new File("C:\\Users\\JohnSmith\\Documents\\Test.txt");
        if(files.isDirectory()) {
            System.out.println("Is Directory");
        }
            if(files.isFile()){
                System.out.println("Is File");
            }
        }
    }

