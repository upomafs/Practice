import java.util.Scanner;

/**
 * Created by Upoma on 1/7/2017.
 */
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.print("Enter a number :");
        num1 = sc.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
    }
}