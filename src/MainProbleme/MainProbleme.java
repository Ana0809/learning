package MainProbleme;
import problem1.Afisare;
import problem2.FisierCuExtensie;
import problem3.VerificaDacaExista;
import problem4.PermisiuneDeCitireScriere;
import problem5.FisierSauDirector;
import problem7.DataModificarii;
import problem9.Size;
import java.util.Scanner;

public class MainProbleme {
    public static void main(String[] args) {
        System.out.println("Meniu");
        System.out.println("1. Afisare director");
        System.out.println("2. Fisier cu extensie");
        System.out.println("3. Verifica daca fisierul exista");
        System.out.println("4. Verifica permisiunea de cirire si/sau scriere");
        System.out.println("5. Verifica daca este fisier sau director");
        System.out.println("6. Compara lexicografic");
        MainProbleme p = new MainProbleme();
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Introduceti cifra: ");
            int n = s.nextInt();
            if (n == 1) {     //C:\\Users\\JohnSmith
                Afisare.Afis();
            }
            if (n == 2) {   // C:\\Users\\JohnSmith\\Documents
                FisierCuExtensie.Extensie();
            }
            if (n == 3) {    //C:\\Users\\JohnSmith\\Documents\\Test.txt
                VerificaDacaExista.Verifica();
            }
            if (n == 4) {     //C:\\Users\\JohnSmith\\Documents\\Test.txt
                PermisiuneDeCitireScriere.CitireScriere();
            }
            if (n == 5) {      //C:\\Users\\JohnSmith\\Documents\\Test.txt
                FisierSauDirector.FisierDirector();
            }
            if (n == 7) {    //C:\\Users\\JohnSmith\\Documents\\Test.txt
                DataModificarii.Data();
            }
            if (n == 9) {   //C:\\Users\\JohnSmith\\Documents\\Test.txt
                Size.Kb();
            }
        }
    }
}




