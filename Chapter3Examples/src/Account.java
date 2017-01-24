/**
 * Created by Upoma on 1/16/2017.
 */
public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance > 0.0)
            balance = initialBalance;
    }

    public void credit(double amount) {
        balance = balance + amount;
    }

    public boolean debit(double withdrawAmount) {
        if (withdrawAmount <= balance) {
            balance = balance - withdrawAmount;
            return true;
        } else
            return false;
    }

    public double getBalance() {
        return balance;
    }



  static   void printAmount(Account acc1, Account acc2) {
        System.out.println("Account Balance for first account is = " + acc1.getBalance());
        System.out.println("Account Balance for second account is = " + acc2.getBalance());

    }
}
