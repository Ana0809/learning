package inheritence;

import java.util.ArrayList;

public class Bank {
    String nume;
     private ArrayList<Account> accs;

    public void setAccs(ArrayList<Account> accs) {
        this.accs = accs;
    }

    public Bank(String nume) {
        this.nume = nume;
    }

    public void show() {
        for (int i = 0; i < accs.size(); i++) {
            System.out.println(accs.get(i) + " ");
        }
    }

    public ArrayList<Account> getAccs() {
        return accs;
    }

    public void Cont(Account a) {
    }
    public void Cont(SavingsAccount sa) {
    }
    public void Cont(CurrentAccount ca) {
    }
}

