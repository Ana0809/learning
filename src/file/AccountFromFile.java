package file;

import inheritence.Bank;
import inheritence.Account;
import inheritence.CurrentAccount;
import inheritence.SavingsAccount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AccountFromFile {
    public static void main(String[] args) throws Exception {
        Bank brd = nouaBanca();
        Scanner sc = citireScanner();
        citireFisier(brd, sc);
        afisare(brd);
    }

    private static Bank nouaBanca() {
        Bank brd = new Bank("BRD");
        brd.setAccs(new ArrayList<>());
        return brd;
    }

    private static Scanner citireScanner() throws FileNotFoundException {

        while (true) {
            try {
                System.out.println("Introdu fisier");
                Scanner keyboard = new Scanner(System.in);
                File file = new File(keyboard.nextLine());
                return new Scanner(file);
            } catch (FileNotFoundException file) {
                System.out.println("Reintrodu fisierul");
            }
        }
    }

    private static void citireFisier(Bank brd, Scanner sc) {
        while (sc.hasNextLine()) {
            try {
                Account a;
                String g = sc.nextLine();
                String s = sc.nextLine();
                int accs = Integer.parseInt(s);
                a = conditiiAccount(sc, g, accs);
                brd.getAccs().add(a);
            }
            catch(NumberFormatException ex){
                System.out.println("S-a creat o eroare in fisier");
            }
        }
    }

    private static Account conditiiAccount(Scanner sc, String g, int accs) {
        Account a;
        if (g.equals("A")) {
            a = new Account(accs);
            a.bal = Double.parseDouble(sc.nextLine());
        } else if (g.equals("B")) {
            a = new SavingsAccount(accs);
            a.bal = Double.parseDouble(sc.nextLine());
            ((SavingsAccount) a).interest = Double.parseDouble(sc.nextLine());
        } else {
            a = new CurrentAccount(accs);
            a.bal = Double.parseDouble(sc.nextLine());
            ((CurrentAccount) a).limit = Double.parseDouble(sc.nextLine());
        }
        return a;
    }

    private static void afisare(Bank brd) {
        for (int i = 0; i < brd.getAccs().size(); i++) {
            System.out.println(brd.getAccs().get(i));
        }
    }
}