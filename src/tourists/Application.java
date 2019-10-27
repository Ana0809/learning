package tourists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Useranme");
        Scanner keyboard = new Scanner(System.in);
        String user = keyboard.nextLine();
        System.out.println("Password");
        String parola = keyboard.nextLine();
        File file = new File("C:\\Users\\JohnSmith\\Documents\\users.txt");
        Scanner sc = new Scanner(file);
        boolean b = true;
        String rol = null;
        while (sc.hasNextLine()) {
            if (user.equals(sc.nextLine())) {
                if (parola.equals(sc.nextLine())) {
                    b = false;
                    rol = sc.nextLine();
                    System.out.println("Rolul este " + rol);
                    break;
                }
            }
        }
        if (b == false) {
            System.out.println("Exista"); //admin/enter/modifica
        } else System.out.println("Nu exista");//client//enter/.sortare//afisrare totala


        while (true) {
            if (rol.equals("admin")) {
                System.out.println("Modifica");
                break;
            }
            if(rol.equals("client")){
                System.out.println("1.Sorteaza");
                System.out.println("2.Afisare totala");
                break;
            }
        }
    }
}
