package inheritence;

import java.util.ArrayList;

public class MainAccount {
    public static void main(String[] args) {

        SavingsAccount savings1 = new SavingsAccount(1);
        SavingsAccount savings2 = new SavingsAccount(2);
        SavingsAccount savings3 = new SavingsAccount(3);
        CurrentAccount current1 = new CurrentAccount(4);
        CurrentAccount current2 = new CurrentAccount(5);
        CurrentAccount current3 = new CurrentAccount(6);

        savings1.deposit(100);
        current1.withdraw(200);

        Bank b = new Bank("BRD");
        b.v = new ArrayList<>();
        b.v.add(savings1);
        b.v.add(savings2);
        b.v.add(savings3);
        b.v.add(current1);
        b.v.add(current2);
        b.v.add(current3);

        b.v.size();
        b.show();
        scrisoare(b);
    }
        public static void scrisoare(Bank b){
            for (int i = 0; i < b.v.size(); i++) {
                if (b.v.get(i).getBalance() < 0){
                    System.out.println(b.v.get(i) + " are contul pe minus ");
                }
            }
        }
    }




