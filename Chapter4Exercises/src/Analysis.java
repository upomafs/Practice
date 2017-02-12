import java.util.Scanner;

/**
 * Created by Upoma on 1/27/2017.
 */
public class Analysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int passes=0;
        int failures=0;
        int studentCounter=1;
        int result;
        while(studentCounter<=10)
        {
            System.out.println("Enter result(1=pass or 2= fail)");
            result=sc.nextInt();
            if(result==1) passes=passes+1;
          else if(result==2)failures++;
          else if (result!=1 && result!=2) {System.out.println("Only value allowed is 1 or 2");
         result=sc.nextInt(); }


          studentCounter++;
        }
        System.out.println("passed:"+passes+" and failed: "+failures);
        if(passes>8){
            System.out.println("Bonus to instructor!");
        }

    }
}
