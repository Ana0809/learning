package algorithms;

public class SelectSort {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        N=3;
        v=new int[N];
        BK(0);
    }


    static int N;
    static int[] v;
    static void BK(int k){
        int i;
        for(i=0;i<N;i++){
            v[k]=i;
            if(valid(k)){
                if(solutie(k))
                    afisare();
                else
                    BK(k+1);
            }
        }
    }

    static boolean solutie(int k){ //daca k=N-1, inseamna ca am plasat toate damele
        if(k==N-1)
            return true;
        else
            return false;
    }
    static boolean valid(int k){ //verificam daca solutia partiala curenta este valida
        for(int i=0;i<k;i++)
            if(( v[i]==v[k]) || (Math.abs(v[k]-v[i])==k-i)) {
                return false;}
        return true;
    }
    static void afisare() //afisam solutiile sub forma unei matrice
    {
        System.out.println();
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++) {

                if(v[i]==j) {
                    System.out.print("D ");}
                else
                    System.out.print("- ");}
            System.out.println();
        }
}}
