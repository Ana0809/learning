package Algoritmica;

public class Merge {

    public static void main(String[] args) {
        int[] n = {5, 0, 15, 20, 3};
        sort(n);
        for (int i = 0; i < n.length; i++)
            System.out.println(n[i]);
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
    }
}

