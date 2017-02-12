import java.util.Scanner;

/**
 * Created by Upoma on 2/4/2017.
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, reverseN;
        while(true) {
            System.out.println("Enter a number (-1 to exit): ");
            n = sc.nextInt();
            if(n==-1)break;
            reverseN = reverseInt(n);

            if (reverseN == n) System.out.println("Palindrome");
            else System.out.println("Not a palindrome");
        }
    }
    public static int reverseInt(int n){
        int power=1, temp, ret=0;
        temp = n;

        temp/=10;
        while(temp>0) {
            power*=10;
            temp/=10;
        }

        temp = n;

        while(temp > 0){
            int digit = temp % 10;
            int unit = digit * power;
            ret += unit;
            temp /= 10;
            power /= 10;
        }
        return ret;
    }
}

/*
564641   power = 100000

146465
100000   power = 100000
 40000   power = 10000
  6000   power = 1000
   400   power = 100
    60   power = 10
     5   power = 1

*/