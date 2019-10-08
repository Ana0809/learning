package inheritence;

public class SavingsAccount extends Account {
    public double interest = 0.1;

    public SavingsAccount(int a) {
        super(a);
    }

    @Override
    public void deposit(double sum) {
        if (sum > 0) {
            bal += sum + (sum * this.interest);
        } else {
            System.err.println("Account.deposit(...): "
                    + "cannot deposit negative amount.");
        }
    }
}
