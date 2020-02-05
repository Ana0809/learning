package Algoritmica;
import java.util.ArrayList;
import java.util.Scanner;

public class Algoritmica {
    public static void main(String[] args) {
        ArrayList<Integer>elemente = new ArrayList<>();
        elemente.add(3);
        elemente.add(4);
        elemente.add(5);
        elemente.add(4);

        elemente.contains(4);
        Scanner k= new Scanner(System.in);
        int x = k.nextInt();
        int i;
        int count = 0;
        for(i = 0; i<elemente.size();i++){
            if(elemente.get(i)==x){
                count++;
            }
        }
        System.out.println("Nr dat se repeta de " + count + " ori");

    }
}
