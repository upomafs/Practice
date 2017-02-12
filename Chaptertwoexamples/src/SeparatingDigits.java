import java.util.Scanner;

/**
 * Created by Upoma on 1/8/2017.
 */
public class SeparatingDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         int num,nr1,nr2,nr3,nr4,nr5;
        System.out.print("Enter a number which consists five digits:");
         num = sc.nextInt();
        nr1=num/10000;
        nr2=(num%10000)/1000;
        nr3=(num%1000)/100;
        nr4=(num%100)/10;
        nr5=num%10;

        System.out.println(nr1+" "+nr2+" "+nr3+" "+nr4+" "+nr5);

    }





}
