import java.util.Scanner;

/**
 * Created by Upoma on 1/10/2017.
 */
public class NegativePositiveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, n4, n5, num_pv = 0, num_neg = 0, num_zer = 0;
        System.out.println("Enter 5 digits:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();
        n5 = sc.nextInt();
        if (0 < n1) num_pv++;
        if (0 < n2) num_pv++;
        if (0 < n3) num_pv++;
        if (0 < n4) num_pv++;
        if (0 < n5) num_pv++;


        if (n1 < 0) num_neg++;
        if (n2 < 0) num_neg++;
        if (n3 < 0) num_neg++;
        if (n4 < 0) num_neg++;
        if (n5 < 0) num_neg++;


        if (n1 == 0) num_zer++;
        if (n2 == 0) num_zer++;
        if (n3 == 0) num_zer++;
        if (n4 == 0) num_zer++;
        if (n5 == 0) num_zer++;

            System.out.println("Number of positive numbers= " + num_pv);
            System.out.println("Number of negative numbers= " + num_neg);
            System.out.println("Number of zeros = " + num_zer);

        }
    }

