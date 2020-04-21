package algorithms;

public class Instest {
    public static void main(String[] args) {
        int v[]={2,1,4,3,8,7,9};
        for(int i=1;i<v.length;i++){
            int elementCurent=v[i];
            int pozitieCurenta=i-1;
            while(pozitieCurenta>=0 && elementCurent<v[pozitieCurenta])
            {
                v[pozitieCurenta+1]=v[pozitieCurenta];
                pozitieCurenta--;
            }
            v[pozitieCurenta+1]=elementCurent;
        }
    }
}
