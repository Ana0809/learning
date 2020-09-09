package ex2020;

import java.util.Arrays;

public class Bin {
    public static void main(String[] args) {
        int x[] = {1, 3, 5, 5, 2, 4, 7, 3, 8};
        System.out.println(Arrays.toString(da(x)));
    }

    private static int[] da(int[] v) {
        int w[] = new int[v.length];
        int i = 0;
        int j = 0;
        while (i < v.length && j < w.length) {
            if (v[i] % 2 != 0) {
                w[j++] = v[i++];
            } else {
                i++;
                j++;
            }
        }
        return w;
    }
}
