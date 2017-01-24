import java.util.Scanner;
/**
 * Created by Upoma on 1/6/2017.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Welcome to java programming");

        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        System.out.print("Enter 1st number:");
        num1 = sc.nextInt();

        System.out.print("Enter 2nd number:");
        num2 = sc.nextInt();

        System.out.print("Enter 3rd number:");
        num3 = sc.nextInt();

        System.out.print("Enter 4th number:");
        num4 = sc.nextInt();

        System.out.print("Enter 5th number:");
        num5 = sc.nextInt();

        int small_which, large_which;

        large_which = 1;
        int biggest = num1;
        if(num2>biggest){biggest=num2; large_which = 2;}
        if(num3>biggest){biggest=num3; large_which = 3;}
        if(num4>biggest){biggest=num4; large_which = 4;}
        if(num5>biggest){biggest=num5; large_which = 5;}

        System.out.println("Num"+large_which+ " is the largest");

        small_which =1;
        int smallest = num1;
        if(num2<smallest) {smallest= num2;small_which=2;}
        if(num3<smallest) {smallest= num3;small_which=3;}
        if(num4<smallest) {smallest= num4;small_which=4;}
        if(num5<smallest) {smallest= num5;small_which=5;}

        System.out.println("Num"+small_which+" is the smallest");



//        if ((num1 > num2) && (num1 > num3) && (num1 > num4) && (num1 > num5)) {
//
//            System.out.println("1st number is the greatest");
//        } else if ((num2 > num3) && (num2 > num4) && (num1 > num5)) {
//
//            System.out.println("2nd number is the greatest");
//        } else if ((num3 > num4) && (num3 > num5)) {
//            System.out.println("3rd number is the greatest");
//        } else if (num4 > num5) {
//            System.out.println("4th number is the greatest");
//        }
//            else
//            {
//                System.out.println("5th number is the greatest");
//        }
    }
}

