package geometrie;

import java.util.*;

public class FormeGeometrice {

    static double rezultat;
    static Scanner s;
    static ArrayList<String> forme = new ArrayList<>();
    static ArrayList<Double> rezultate = new ArrayList<>();
    public static void main(String[] args) {
        meniu();
        afisare();
    }

    private static void meniu() {

        while (true) {
            System.out.println("Introdu formele dorite, cand ai terminat introdu GATA");
            s = new Scanner(System.in);
            String introduForma = s.nextLine();
            forme.add(introduForma);
            if (introduForma.equals("patrat")) {
                rezultat = ariePatrat();
            } else if (introduForma.equals("dreptunghi")) {
                rezultat = arieDreptunghi();
            } else if (introduForma.equals("cerc")) {
                rezultat = arieCerc();
            } else if (introduForma.equals("GATA")) {
                forme.remove(forme.size() - 1);
                break;
            }
            rezultate.add(rezultat);
        }
    }

    private static double ariePatrat() {
        try {
            System.out.println("Care este latura?");
            double latura = s.nextDouble();
            rezultat = latura * latura;

        } catch (InputMismatchException e) {
            System.out.println("Trebuie introdus un numar");
        }
        return rezultat;
    }

    private static double arieDreptunghi() {
        try {
            System.out.println("Care este lungimea?");
            double lungime = s.nextDouble();
            System.out.println("Care este latimea?");
            double latime = s.nextDouble();
            rezultat = latime * lungime;
        } catch (InputMismatchException e) {
            System.out.println("Trebuie introdus un numar");
        }
        return rezultat;
    }

    private static double arieCerc() {
        try {
            System.out.println("Care este lungimea razei?");
            double raza = s.nextDouble();
            final double pi = 3.14;
            rezultat = pi * raza;
        } catch (InputMismatchException e) {
            System.out.println("Trebuie introdus un numar");
        }
        return rezultat;
    }

    private static void afisare() {
        Iterator<String> it = forme.iterator();
        Iterator<Double> f = rezultate.iterator();
        while (it.hasNext()) {
            String el = it.next();
            Double e = f.next();
            System.out.println(el + " " + e);
        }
    }
}