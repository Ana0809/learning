package problem2;

import java.io.File;
import java.io.FilenameFilter;

public class Main {
    public static void main(String[] args) {
        File files = new File("C:\\Users\\JohnSmith\\Documents");
        String[] array = files.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".txt")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}



