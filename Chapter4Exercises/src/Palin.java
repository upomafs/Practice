import java.util.Scanner;

/**
 * Created by Upoma on 2/4/2017.
 */
public class Palin {
    public static void main(String[] args) {
        int n, reverseN;
        while (true) {
            System.out.println("Enter a digit to check(-1 to exit): ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            if (n == -1) break;
            else {
                reverseN = reverseInt(n);
                if (reverseN == n) System.out.println("It's a palindrome");
                else System.out.println("not a palindrome");


            }
        }
    }

    static int reverseInt(int n) {
        int temp, power = 1, ret = 0;
        temp = n;
        temp /= 10;
        while (temp > 0) {
            power *= 10;
            temp /= 10;
        }
        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            int unit = digit * power;
            ret += unit;
            temp /= 10;
            power /= 10;

        }

        return ret;
    }
}