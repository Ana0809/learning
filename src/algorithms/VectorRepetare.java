package algorithms;

public class VectorRepetare {
    public static void main(String[] args) {
        int w[] = {2, 3, 6, 1, 6, 1, 1};
        int f[] = new int[w.length];
        for (int i = 0; i < w.length; i++) {
            f[w[i]]++;
        }
        for (int i = 0; i < f.length; i++) {
            if (f[i] > 0) {
                System.out.println(i + " apare de " + f[i] + " ori");
            }
    }
}}

