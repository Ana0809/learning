package algorithms;

public class InsertionSort2 {
    public static void main(String args[]) {
        int v[] = {12, 11, 13, 6, 5};

        for (int i = 1; i < v.length; i++) {
            int elementCurent=v[i];
            int pozitieCurenta=i-1;
            while(pozitieCurenta>=0 && elementCurent<v[pozitieCurenta])
            {
                v[pozitieCurenta+1]=v[pozitieCurenta];
                pozitieCurenta--;
            }
            v[pozitieCurenta+1]=elementCurent;
        }

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }

}
