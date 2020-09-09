package algorithms;

public class InsertionSort2 {
    public static void main(String args[]) {
        int v[] = {7, 2, 8, 9, 3, 13, 1};

        for (int i = 1; i < v.length; i++) {
            int y=v[i];
            int x=i-1;
            while(x>=0 && y<v[x]) //v[i]<v[i-1]
            {
                v[x+1]=v[x];
                x--;
            }
            v[x+1]=y;
        }

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }

}
