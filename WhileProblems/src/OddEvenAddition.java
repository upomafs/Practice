import java.util.Scanner;

/**
 * Created by Upoma on 2/12/2017.
 */
public class OddEvenAddition {
    public static void main(String[] args) {
        int n;
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input = ");
        n = sc.nextInt();
        while (n < 0) {
            System.out.println("Input can't be negative");
            n = sc.nextInt();
        }
        System.out.print(n);
        while (n != 1) {
            if (n % 2 == 0) n = n / 2;
            else n = 3 * n + 1;
            counter++;
            System.out.print(" "+n);
        }   //always tabs
        System.out.println();
        System.out.println("The number elements in the sequence = "+counter);

    }
}//2nd way te korsi // indentation er 12 ta bajaiso kn? :/ // :v orey perfectionist  ... -_-that code looked horrible :/:P I love you for this khutkhut shobab