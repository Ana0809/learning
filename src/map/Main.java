package map;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MyMap<Integer,Integer> m = new MyMap<>();
        m.put(2,3);
       m.put(1,5);
//        m.put(4,6);
//        m.put(3,7);
       // m.get(2);
        System.out.println(m.get(1));
        System.out.println(m.get(2));


    }

}
