package Algoritmica;

import java.util.ArrayList;

public class Verifica {
    public static void main(String[] args) {
        ArrayList<Integer> elemente = new ArrayList<>();
        elemente.add(3);
        elemente.add(4);
        elemente.add(5);
        elemente.add(4);
        boolean b = false;
        for (int i = 0; i < elemente.size()-1; i++) {

                if (elemente.get(i) > elemente.get(i+1)) {
                    b = true;
                }
            }

            if (b == true) {
                System.out.println("nu e sortata");
            } else {
                System.out.println("sortata");
            }
        }
    }

