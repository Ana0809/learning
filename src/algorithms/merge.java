package algorithms;

public class merge {
    public static void main(String[] args) {
        int a[] = {0, 3, 5};
        int b[] = {2, 4, 6,7};
        int c[] = new int[a.length + b.length];
        int k = 0;
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];

            } else {
                c[k++] = b[j++];
            }
        }
        while(i<a.length){
            c[k++]=a[i++];
        }
        while(j<b.length){
            c[k++]=b[j++];
        }
        for (int z = 0; z < c.length; z++) {
            System.out.println(c[z]);
        }
    }
}
