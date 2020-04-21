package algorithms;

public class Hanoi {
    public static void main(String[] args) {
        System.out.println("Turnurile din Hanoi:");
        Hanoi(3, 'A', 'C', 'B');
    }
    public static void Hanoi(int n, char from, char to, char auxiliar)
    {
        if (n==1)
        {
            System.out.println("Muta discul" + " 1 de la " + from + " la " + to);
        }
        else
        {
            System.out.println("1");
            Hanoi(n-1, from, auxiliar, to);
            System.out.println("Muta discul " + n +" de la " + from + " la " + to);
            Hanoi(n-1, auxiliar, to, from);
        }
    }
}
