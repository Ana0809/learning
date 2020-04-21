package Algoritmica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Frecventa2 {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("a");
        l.add("a");
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("c");
        l.add("d");
        l.add("d");
        l.add("a");
        l.add("b");
        l.add("b");
        HashMap<String,Integer> map = new HashMap<>();
        Iterator<String> it = l.iterator();
        while(it.hasNext()) {
            String el = it.next();
            if (!map.containsKey(el)) {
                map.put(el, 1);
            }else {
                map.put(el, map.get(el) + 1);
            }
        }
        Iterator<Map.Entry<String, Integer>> itm = map.entrySet().iterator();
        while(itm.hasNext()){
           Map.Entry m = itm.next();
            System.out.print(m.getKey());
            System.out.print(m.getValue());
        }


    }
}
