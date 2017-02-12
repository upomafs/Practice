import java.util.Scanner;

/**
 * Created by Upoma on 1/26/2017.
 */
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String employeeName;
         int employeeNumber=10;
         int numberofHoursWoked;
         double hourlyrRate;
         double overtimeRate;
         int payment=15;
         double totalEarning=0.0;
         System.out.println("Enter hourly rate for the employees = ");
         hourlyrRate=sc.nextDouble();

         while(employeeNumber!=0)
         {
             System.out.println("Enter Employee name : ");
             employeeName=sc.next();
             System.out.println("Enter Number of hours worked : ");
             numberofHoursWoked=sc.nextInt();
             if(numberofHoursWoked<=40)
             {
               totalEarning=(double)(payment*hourlyrRate);
             }
             else if(numberofHoursWoked>40)
             {
                 overtimeRate=1.5*hourlyrRate;
                 totalEarning=(double)(payment*hourlyrRate+overtimeRate);
             }
               System.out.println("For "+employeeName+" the total Salary is "+totalEarning);
               employeeNumber--;
         }



    }
}
