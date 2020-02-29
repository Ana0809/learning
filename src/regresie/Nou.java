package regresie;

import java.util.ArrayList;
import java.util.Scanner;

public class Nou {
    public static void main(String[] args) {
        double a1, a0;
         int N;
        int[] x = {0, 1, 2, 3, 4};
        double y[] = {5.56, 5.952, 6.301, 6.649, 7.026};
        double sumx = 0.0, sumy = 0.0, sumx2 = 0.0, sumxy = 0.0;
        ArrayList<Integer> necunoscute = new ArrayList<>();
        N = x.length;
        ArrayList<Integer> dateX = new ArrayList<>();
        System.out.println("Introdu gradul frunctiei");
        Scanner sc = new Scanner(System.in);
        int gradSpecificat = sc.nextInt();
        for(int j=2;j<=gradSpecificat;j++){
            for (int i = 0; i < N; i++) sumx += x[i];
            for (int i = 0; i < N; i++) sumx += (int) Math.pow(x[i],j);
        }
    }

}
