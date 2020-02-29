package regresie;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearRegression {
    private int N;
    int[] x = {0, 1, 2, 3, 4};
    double y[] = {5.56, 5.952, 6.301, 6.649, 7.026};
    double sumx = 0.0, sumy = 0.0, sumx2 = 0.0, sumxy = 0.0;
    ArrayList<Integer> necunoscute = new ArrayList<>();
    ArrayList<Integer> dateX = new ArrayList<>();
    ArrayList<Double> sume = new ArrayList<>();
    ArrayList<Double> sumey = new ArrayList<>();

    public void rezolvare() {
        if (x.length != y.length) {
            throw new IllegalArgumentException("numarul de date x si y nu este egal");
        }
        N = x.length;

        System.out.println("Introdu gradul frunctiei");
        Scanner sc = new Scanner(System.in);
        int gradSpecificat = sc.nextInt();
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

        for (int j = 0; j < sumey.size(); j++) {
            int i;
            for (i = j; i < gradSpecificat + 1; i++) {
                System.out.print(sume.get(i) + "a");
                for (int k = 0; k < necunoscute.size(); k++) {
                    if (k == i) System.out.print(necunoscute.get(k));
                }
                if (i < gradSpecificat) {
                    System.out.print(" + ");
                }
            }
            System.out.print(" = " + sumey.get(j));
            System.out.println();
            i++;
            gradSpecificat++;

        }

        

//        double det = N * sumx2 - (sumx * sumx);
//        if (det != 0) {
//            folosesteCrammer(det);
//        }
//    }
//
//    public void folosesteCrammer(double det) {
//        double det0 = sumy * sumx2 - sumx * sumxy;
//        double det1 = N * sumxy - sumy * sumx;
//
//        a0 = det0 / det;
//        a1 = det1 / det;
//        System.out.println(a0);
//        System.out.println(a1);
        }
    }




