import java.util.Scanner;

/**
 * Created by Upoma on 2/6/2017.
 */
public class CarryOutAdd {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int n, m;
            System.out.println("Enter two integers to add(-1 to exit): ");
            n = sc.nextInt();
            m = sc.nextInt();
            if (n == -1 && m == -1) break;
            else {
                int car = carryAddition(n, m);
                System.out.println("The value of the addition = " + car);
            }
        }
    }
    static int carryAddition(int n,int m){
        int nlastDigit,mlastDigit,carry=0,sum=0,digitSum=0,multiply=1;
        if(n>m)
        {
            int t = n;
            n=m;
            m=t;
        }
        while(n>0){
            nlastDigit=n%10;
            mlastDigit=m%10;
            n/=10;
            m/=10;
            digitSum=nlastDigit+mlastDigit+carry;
            sum+=((digitSum%10)*multiply);
            multiply*=10;
            carry=digitSum/10;
        }
        sum+=(carry*multiply);
        return  sum;

        }

}
