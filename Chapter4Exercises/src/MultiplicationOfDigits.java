import java.util.Scanner;

/**
 * Created by Upoma on 2/4/2017.
 */
public class MultiplicationOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,multiplied;
        while(true)

        {
            System.out.println("Enter a number and (-1) to exit: ");
            n= sc.nextInt();
            if(n==-1) break;
            else {
                multiplied = multuplyDigits(n);
                System.out.println("The multiplied value = "+multiplied);

            }
        }

    }
    static int multuplyDigits(int n ){

        int mulp=1,temp;
        temp=n;
        while(temp!=0)
        {
            mulp*=temp%10;
            temp/=10;

        }
        return  mulp;

    }
}
