package tourists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("C:\\Users\\JohnSmith\\Documents\\holiday.txt");
        ArrayList<Destination> destinations = new ArrayList<>();
        ArrayList<String> fileList = new ArrayList<>();
        for (int i = 0; i < fileList.size(); i++) {
           Destination d = new Destination();
           d.setCountry(fileList.get(i));
            destinations.add(d);
            System.out.println(fileList.get(i));
            for (int j = i + 1; j < fileList.size(); j++) {
                if (fileList.get(j).startsWith("CY-")) {
                    City c = new City();
                    c.setName(fileList.get(j));
                    d.getCities().add(c);
                    System.out.println(fileList.get(j));
                } else if (fileList.get(j).startsWith("C-")) {
                    i = j;
                    break;
                }
            }
        }
    }
}