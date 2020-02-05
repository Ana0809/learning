package geometrie;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    static double raza;
    static double latura;
    static double lungimea;
    static double latimea;
    static List<Geometrie> geometrieList = new ArrayList<>();

    public static void main(String[] args) {
        introducereForme();
        afisare();
    }

    private static void introducereForme() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introdu o forma geometrica");
        System.out.println("pentru a iesi si afisa aria introdu exit");

        boolean b = false;
        try {
            while (b == false) {
                String forma = sc.nextLine();
                switch (forma) {
                    case ("patrat"):
                        System.out.println("introdu latura patratului");
                        Patrat p = new Patrat();
                        latura = sc.nextDouble();
                        p.setLatura(latura);
                        geometrieList.add(p);
                        System.out.println("introdu urmatoarea forma");
                        break;
                    case ("cerc"):
                        System.out.println("introdu raza cercului");
                        Cerc c = new Cerc();
                        raza = sc.nextDouble();
                        c.setRaza(raza);
                        geometrieList.add(c);
                        System.out.println("introdu urmatoarea forma");
                        break;
                    case ("dreptunghi"):
                        Dreptunghi d = new Dreptunghi();
                        System.out.println("introdu latimea dreptunghiului");
                        latimea = sc.nextDouble();
                        d.setLatime(latimea);
                        System.out.println("introdu lungimea dreptunghiului");
                        lungimea = sc.nextDouble();
                        d.setLungime(lungimea);
                        geometrieList.add(d);
                        System.out.println("introdu urmatoarea forma");
                        break;
                    case ("exit"):
                        System.out.println("Ai iesit!");
                        b = true;
                        break;
                    default:
                         System.out.println("Figura nu este corecta");
                        break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Trebuie introdusa o cifra");
        }
    }

    private static void afisare() {
        for (int i = 0; i < geometrieList.size(); i++) {
            System.out.println(geometrieList.get(i).getNume() + " " + geometrieList.get(i).arie());
        }
    }
}
