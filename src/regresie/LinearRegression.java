package regresie;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearRegression {
    private int N;
    int[] x = {0, 12, -8, 53, -44, 88, -61, 120};
    double y[] = {-2, 25, -125, 7, -33,44,70, -144, 220};
    double sumx = 0.0, sumx2 = 0.0, sumxy = 0.0;
    ArrayList<Integer> necunoscute = new ArrayList<>();
    ArrayList<Integer> dateX = new ArrayList<>();
    ArrayList<Double> sume = new ArrayList<>();
    ArrayList<Double> sumey = new ArrayList<>();
    int gradSpecificat;

    public void rezolvare() {

        informatiiFunctie();
        adaugareSumeInLista();
        ecuatiiAfisate(gradSpecificat);
        calculDeterminanti();

    }

    private void informatiiFunctie() {
        if (x.length != y.length) {
            throw new IllegalArgumentException("numarul de date x si y nu este egal");
        }
        N = x.length;

        System.out.println("Introdu gradul frunctiei");
        Scanner sc = new Scanner(System.in);
        gradSpecificat = sc.nextInt();
        if (gradSpecificat >= 1) {
            System.out.println(gradSpecificat + 1 + ": numarul de necunoscute pe care il are functia ");
            for (int i = 0; i <= gradSpecificat; i++) {
                necunoscute.add(i);
                dateX.add(i);
            }
            System.out.print("Functia are forma: f(x) = ");
            for (int i = 0; i < necunoscute.size(); i++) {
                for (int j = i; j < dateX.size(); j++) {
                    System.out.print("a" + necunoscute.get(i));
                    System.out.print("X^" + dateX.get(j) + " ");
                    if (i < necunoscute.size() - 1) {
                        System.out.print("+ ");
                    }
                    i = j;
                    i++;
                }
            }
        }
        System.out.println();
        System.out.println(gradSpecificat + 1 + ": numarul de ecuatii normale pe care il are sistemul");
    }

    public void adaugareSumeInLista() {
        for (int k = 0; k <= gradSpecificat; k++) {
            sumx = 0;
            for (int i = 0; i < N; i++) sumx += (int) Math.pow(x[i], k);
            sume.add(sumx);
            System.out.println("X^" + k + ":suma " + sumx);
        }

        for (int k = 1; k <= gradSpecificat; k++) {
            sumx2 = 0;
            for (int i = 0; i < N; i++) sumx2 += (int) Math.pow(x[i], gradSpecificat + k);
            sume.add(sumx2);
            System.out.print("X^");
            System.out.println(gradSpecificat + k + ":suma " + sumx2);
        }
        for (int k = 0; k <= gradSpecificat; k++) {
            sumxy = 0;
            for (int i = 0; i < N; i++) sumxy += y[i] * (int) Math.pow(x[i], k);
            sumey.add(sumxy);
            System.out.println("Y*X^" + k + ":suma " + sumxy);

        }
    }

    public void ecuatiiAfisate(int grad) {
        for (int j = 0; j < sumey.size(); j++) {
            int i;
            for (i = j; i < grad + 1; i++) {
                System.out.print(sume.get(i) + "a");
                for (int k = 0; k < necunoscute.size(); k++) {
                    System.out.print(necunoscute.get(k));
                }
                if (i < grad) {
                    System.out.print(" + ");
                }
            }
            System.out.print(" = " + sumey.get(j));
            System.out.println();
            i++;
            grad++;

        }
    }

    public void calculDeterminanti() {
        double diagonalaPrincipala = 1;
        for (int i = 0; i < sume.size(); i += 2) {
            diagonalaPrincipala *= sume.get(i);
        }

        double diagonalaSecundara = Math.pow(sume.get(gradSpecificat), gradSpecificat + 1);
        System.out.print("Determinantul are valoarea: ");
        double rezultatdet = diagonalaPrincipala - diagonalaSecundara;
        System.out.println(rezultatdet);

//////////det0 pentru gradul 1
//        for (int k = 0; k < necunoscute.size(); k++) {
//            for (int j = 0; j < sumey.size(); j++) {
                double diagPrincipFaraElemY = 1;
                for (int i = gradSpecificat + 1; i < sume.size(); i += 2) {      //se ignora prima linie
                    diagPrincipFaraElemY *= sume.get(i);
                }
                double diagPrincipFinala = diagPrincipFaraElemY * sumey.get(0);
                System.out.println(diagPrincipFinala);

                double diagSecundara = 1;
                diagSecundara = Math.pow(sume.get(gradSpecificat), gradSpecificat) * (sumey.get(1));
                System.out.println(diagSecundara);
                double rezultatdet0 = diagPrincipFinala - diagSecundara;
                System.out.println("Rezultat a0 :" + rezultatdet0 / rezultatdet);

//////////det1
            double diagPrincipFaraElemY2 = 1;
            for (int i = 0; i < gradSpecificat + 1; i += 2) {      //se ignora prima linie
                diagPrincipFaraElemY2 *= sume.get(i);
            }
            double diagPrincipFinala2 = diagPrincipFaraElemY2 * sumey.get(1);
            System.out.println(diagPrincipFinala2);

            double diagSecundara2 = 1;
            diagSecundara2 = Math.pow(sume.get(gradSpecificat), gradSpecificat) * (sumey.get(0));

            System.out.println(diagSecundara2);
            double rezultatdet1 = diagPrincipFinala2 - diagSecundara2;
            System.out.println("Rezultat a1 :" + rezultatdet1 / rezultatdet);

        }


    }





