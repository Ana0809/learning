package MainProbleme;

import problem1.Afisare;
import problem15.WriteAndRead;

import problem17.Line;
import problem2.FisierCuExtensie;
import problem3.VerificaDacaExista;
import problem4.PermisiuneDeCitireScriere;
import problem5.FisierSauDirector;
import problem6.ComparLexicografic;
import problem7.DataModificarii;
import problem9.Size;

import java.io.IOException;
import java.util.ArrayList;

import java.util.Scanner;

import problem18.Long;

public class MainProbleme {
    public static void main(String[] args) throws IOException {
        while (true) {
            printMeniu();
            int n = readOption();
            if (n == 1) {     //C:\\Users\\JohnSmith
                Afisare.Afis();
            } else if (n == 2) {   // C:\\Users\\JohnSmith\\Documents
                FisierCuExtensie.Extensie();
            } else if (n == 3) {    //C:\\Users\\JohnSmith\\Documents\\Test.txt
                VerificaDacaExista.Verifica();
            } else if (n == 4) {     //:\Users\JohnSmith\Documents\Test.txtC
                PermisiuneDeCitireScriere.CitireScriere();
            } else if
            (n == 5) {      //C:\\Users\\JohnSmith\\Documents\\Test.txt
                FisierSauDirector.FisierDirector();
            } else if (n == 6) {//C:\\Users\\JohnSmith\\Documents\\Test.txt
                ArrayList<String> myList = new ArrayList<>();
                ArrayList<String> myList2 = new ArrayList<>();

                ComparLexicografic.PopulateListAndShowing(myList);
                ComparLexicografic.PopulateListAndShowing(myList2);
                ComparLexicografic.printingResults(myList, myList2);

            } else if (n == 7) {    //C:\\Users\\JohnSmith\\Documents\\Test.txt
                DataModificarii.Data();
            } else if (n == 9) {   //C:\\Users\\JohnSmith\\Documents\\Test.txt
                Size.Kb();
            } else if (n == 15) {   //C:\\Users\\JohnSmith\\Documents\\Test.txt
                WriteAndRead.Read();
                WriteAndRead.Write();

            } else if (n == 17) {   //C:\\Users\\JohnSmith\\Documents\\Test.txt
                ArrayList<String> myList4 = new ArrayList<>();
                Line.First();
            } else if (n == 18) {   //C:\\Users\\JohnSmith\\Documents\\Test.txt
                ArrayList<String> myList5 = new ArrayList<>();
                Long.Word(myList5);
            } else if (n >= 19) {
                System.out.println("Optiunea aleasa nu exista!");
            }else if (n == 0) {
                System.out.println("Se inchide aplicatia");
                break;
            }
        }
    }

    private static int readOption() {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti cifra: ");
        return s.nextInt();
    }

    private static void printMeniu() {
        System.out.println("Meniu:");
        System.out.println("0. Se inchide aplicatia!");
        System.out.println("1. Afisare director");
        System.out.println("2. Fisier cu extensie");
        System.out.println("3. Verifica daca fisierul exista");
        System.out.println("4. Verifica permisiunea de cirire si/sau scriere");
        System.out.println("5. Verifica daca este fisier sau director");
        System.out.println("6. Compara lexicografic");
        System.out.println("7. Afisare data ultimei modificari");
        System.out.println("9. Afisare dimensiune");
        System.out.println("15.Scrie si citeste dim fisier");
        System.out.println("16. Lipeste text in fisier");
        System.out.println("17. Afiseaza primele 3 linii din fisier");
        System.out.println("18. Afiseaza cel mai lung cuvant din fisier");
    }
}





