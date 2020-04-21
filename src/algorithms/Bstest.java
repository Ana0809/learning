package algorithms;

public class Bstest {
    public static void main(String[] args) {
        int v[] = {2, 1, 4, 3, 8, 5};
        boolean b = true;
        int ultim=v.length;
        while (b){
            for (int i = 1; i < ultim; i++) {
                if (v[i] < v[i - 1]) {
                    int aux = v[i];
                    v[i] = v[i - 1];
                    v[i - 1] = aux;
                    b = false;
                }

            }
            } for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }

    }
}
