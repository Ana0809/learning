package file;
public class Test {
    public static void main(String[] args) {
        int[] v = {10, 60, 20, 45, 70};
        int w[] = {15, 19, 70, 40, 20, 19, 10, 21};
       int x[] = new int[5];
        int i = 0, j = 0;
        int k=0;
        for (i = 0; i < v.length; i++) {
            for (j = 0; j < w.length; j++) {
                if (v[i] == w[j]) {
                   x[k]=v[i];
                }
                }
            System.out.println(x[k]);
            }

        }
    }

