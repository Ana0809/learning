package inheritence;

import java.util.ArrayList;

class Bank  {
    String nume;
    ArrayList<Account> v;

    public Bank(String nume) {
        this.nume = nume;
   }

    public void show() {
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i) + " ");
        }
    }
}

