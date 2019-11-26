package Algoritmica;

import java.util.ArrayList;

public class Frecventa {
    public static void main(String[] args) {
        ArrayList<Integer>f = new ArrayList<>();
        f.add(3);
        f.add(6);
        f.add(1);
        f.add(14);
        f.add(10);
        f.add(1);
        int count = 0;
        for(int i=0;i<f.size();i++){
            count = 0;
            for(int j=0;j<f.size();j++){
                if(f.get(i).equals(f.get(j))){
                    count++;
                }
            }
            System.out.println("Elementul "+f.get(i) + " apare de " + count);
        }

    }
}
