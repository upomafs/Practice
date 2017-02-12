/**
 * Created by Upoma on 1/16/2017.
 */
import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {
        Account acc1 = new Account(7.00);
        Account acc2 = new Account(-50.30);

        printAmount(acc1,acc2);

        Scanner sc = new Scanner(System.in);

        double depositAmount;

        System.out.println("Enter an amount to deposit in first account = ");
        depositAmount = sc.nextDouble();
        System.out.println("adding"+ depositAmount+"to first account");
        acc1.credit(depositAmount);

        printAmount(acc1,acc2);

        System.out.println("Enter an amount to deposit in second account = ");
        depositAmount = sc.nextDouble();
        System.out.println("adding"+ depositAmount+"to second account");
        acc2.credit(depositAmount);

        printAmount(acc1,acc2);

        double debitAmount;
        System.out.println("Enter an amount to withdraw from first account = ");
        debitAmount = sc.nextDouble();
        if(acc1.debit(debitAmount)){
            System.out.println("Withdrawing "+ debitAmount + " from first account");
        }
        else
            System.out.println("Debit amount exceeded account balance");

        acc1.printAmount(acc1,acc2);

        System.out.println("Enter an amount to withdraw from second account = ");
        debitAmount = sc.nextDouble();
        if(acc2.debit(debitAmount)){
            System.out.println("withdrawing "+ debitAmount + " from second account");
        }
        else
            System.out.println("Debit amount exceeded account balance");

        printAmount(acc1,acc2);
    }

    static void  printAmount(Account acc1, Account acc2){
        System.out.println("Account Balance for first account is = " + acc1.getBalance());
        System.out.println("Account Balance for second account is = " + acc2.getBalance());

    }
}
