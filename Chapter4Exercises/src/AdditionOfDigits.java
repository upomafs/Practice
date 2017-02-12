import java.util.Scanner;

/**
 * Created by Upoma on 2/4/2017.
 */
public class AdditionOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number and (-1) to exit: ");
            int n = sc.nextInt();
            if(n==-1) break;
            else{
                int added =addDigits(n);
                System.out.println("The added value = "+added);
            }


        }




    }
    public static int addDigits(int n)
    {
     int   add = 0,temp;
     temp=n;

     while(temp!=0) {
        add+=temp%10;

         temp=temp/10;

     }

        return add;
    }
}
