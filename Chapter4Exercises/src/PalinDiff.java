import java.util.Scanner;

/**
 * Created by Upoma on 2/6/2017.
 */
public class PalinDiff {
    public static void main(String[] args) {
        int n, reverseN;
        while (true) {
            System.out.println("Enter a digit to check(-1 to exit): ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            if (n == -1) break;
            else {
                reverseN = reverseInt(n);
                if (reverseN == n){ System.out.println("It's a palindrome");}
                else {System.out.println("not a palindrome");}
            }
        }
    }
       static int reverseInt(int n){
        int ret=0;
        while(n>0){
            ret*=10;
            ret+=(n%10);
            n/=10;
        }
            return  ret;
    }
    }

