package Algoritmica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DublicateMap {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista.add(1);
        lista.add(6);
        lista.add(3);
        lista.add(4);
        lista.add(4);
        lista.add(6);
        lista.add(6);
        lista.add(2399494);
        lista.add(6);
        lista.add(8);
        lista.add(8);
        lista.add(1);
        lista.add(30000);
        lista.add(30000);
        lista.add(20);
        lista.add(4);
        lista.add(4);

        HashMap<Integer, Integer> map = new HashMap<>();
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            Integer nr = it.next();
            if (map.get(nr) == null) {
                map.put(nr, 1);
                lista1.add(nr);
            }
            }
            System.out.println("Elem din lista dupa ce se scot dublicatele: ");
            for (int i = 0; i < lista1.size(); i++) {
                System.out.println(lista1.get(i));
            }
        }

    }


