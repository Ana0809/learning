package inheritence;

import java.util.ArrayList;

public class MainEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ionel", 20000, 2004, "101");
        e1.print();
        Employee e2 = new Employee("Viorel",3000, 2001,"102");
        Record r = new Record("lista 1");
        r.w = new ArrayList<>();
        r.w.add(e1);
        r.w.add(e2);
        r.w.size();
        for(int i = 0; i<r.w.size(); i++){
            System.out.println(r.w.get(i));
        }
    }
}
