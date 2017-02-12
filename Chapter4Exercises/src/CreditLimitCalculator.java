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
        System.out.println("Enter a positive counter number to start and -1 to exit :");
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
            beginnggbal = sc .nextInt();
            if(beginnggbal<0) {
                System.out.println("Beginning Balance ca not be negative enter positive value to continue : ");
                beginnggbal =sc.nextInt();    }
           System.out.println("Enter total of all items charged by the customer this month");
        itemChaged=sc.nextInt();
if(itemChaged<0){System.out.println("Item charged can't be negative enter postive value to continue");
itemChaged=sc.nextInt();}
System.out.println("Enter total of all credits applied to the customer’s account this month");
    creditApp=sc.nextInt();
    System.out.println("Enter Credit Limit"); creditLimit = sc.nextInt();
    newBal=beginnggbal+itemChaged- creditApp;
if(newBal<creditLimit) System.out.println("New Balance for account number : "+ accountNum+ " is " +newBal);
   else
   System.out.println("Credit exceed");
}
if(counter==-1)
System.out.println("Thank you for using Credit Limit Calculator");
    }
}
