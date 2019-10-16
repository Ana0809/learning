package problem2;

import java.io.File;
import java.io.FilenameFilter;

public class Main {
    public static void main(String[] args) {
        File files = new File("C:\\Users\\JohnSmith\\Documents");
        String[] array = files.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith("txt")) {
                    return false;
                } else
                    return true;
            }
        });
        for (String File : array) {
            System.out.println(File);
        }
    }
}



