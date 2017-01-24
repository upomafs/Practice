import java.util.Scanner;

public class CreditLimitCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accountNum;
        int beginnggbal;
        int itemChaged;
        int creditApp;
        int creditLimit;
        int newBal;
        int counter;
        System.out.println("Enter a positive counter number to start and -1 to exit");
        counter = sc.nextInt();
        while(counter!=-1) {
            System.out.println("Enter an account number : ");
            accountNum = sc.nextInt();
            if(accountNum<0)
            {
                System.out.println("Account number can't be negative,enter a positive number : ");
                accountNum = sc.nextInt();
            }
            System.out.println("Enter beginning balance : ");


        }

    }


}
