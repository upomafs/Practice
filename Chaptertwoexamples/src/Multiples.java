import java.util.Scanner;

/**
 * Created by Upoma on 1/7/2017.
 */
public class Multiples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int res ;
        System.out.print("Enter first number:");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd number:");
        num2 = sc.nextInt();
        res =num1 /num2;
        if (num1 % num2 == 0) {

            System.out.println("first number is a multiple of second number");
            System.out.println("result=" + res);
        } else {
            System.out.print("first number is not a multiple of second number ");
            System.out.print("result" + "res");
        }
    }
}