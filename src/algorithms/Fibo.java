package algorithms;

public class Fibo {
    public static void main(String[] args) {
  sumaN(4);
    }
    public static int sumaN(int n)
    {
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        System.out.println(n);
        return n+sumaN(n-1);
    }
}
