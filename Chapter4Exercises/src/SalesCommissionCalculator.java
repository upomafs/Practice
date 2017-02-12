/**
 * Created by Upoma on 1/26/2017.
 */
import java.util.Scanner;
public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double comRate =0.09;
        double baseRate=200.00;
        int counter;
        int itemNumber;
        double sold;
        double totalSolds=0.0;
        double earning ;
        System.out.println("Enter number of items that were sold this week : ");
        itemNumber=sc.nextInt();
        while(itemNumber!=0){
            System.out.println("Enter price for each item sold = ");
            sold=sc.nextDouble();
            totalSolds=totalSolds+sold;
            itemNumber--;
        }earning = totalSolds*comRate+baseRate;
        System.out.println("The total Earning of the Sale's person is  ="+ earning);

    }
}