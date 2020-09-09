package ex2020;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int v[] = {1, 2, 3, 4};
        int i = 0;
        int n = 4;
        int j = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(v[i] + "" + v[j] + " ");
            }

            System.out.println();
        }
        System.out.print("sub diagonala");
        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(v[i] + "" + v[j] + " ");
            }
            System.out.println();
        }
        System.out.println("sub inclusiv diagonala");
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(v[i] + "" + v[j] + " ");
            }
            System.out.println();
        }
        System.out.println("deasupra diagonalei");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i < j) {
                    System.out.print(v[i] + "" + v[j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        System.out.println("diagonala");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(v[i] + "" + v[j] + " ");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        System.out.println("sus");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i < n - j) {
                    System.out.print(v[i] + "" + v[j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();

        }
    }
}
