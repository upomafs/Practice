import java.util.Scanner;

/**
 * Created by Upoma on 1/7/2017.
 */
public class Circle {
    public static void main(String[] args) {
        double pi = 3.1416;
        Scanner sc = new Scanner(System.in);
        int r;
        System.out.print("Enter the radius of the circle:");
        r =sc.nextInt();
        /*float diameter;
        diameter = 2*r ;
        double circum;
        circum =2*pi*r;
        double area;
        area = pi*r*r;*/
        System.out.println("Diameter:"+ 2*r );
        System.out.println("Circumference:"+ 2*pi*r);
        System.out.println("Area:"+ pi*r*r);



    }


}
