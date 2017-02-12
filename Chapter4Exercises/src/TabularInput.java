import java.util.Scanner;

/**
 * Created by Upoma on 1/26/2017.
 */
public class TabularInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  number;
        int tens;
        int hun;
        int thou;
        int counter=5;
        System.out.println("Enter the number of consecutive digits you  want to calculate = ");
        counter=sc.nextInt();
        System.out.println("N"+ "N*10"+ "N*100"+ "N*1000");
        while(counter!=0) {
            number=sc.nextInt();
            tens=number*10;
            hun=number*100;
            thou=number*1000;
            System.out.println(number+" "+tens +" "+hun+" "+thou);
            counter--;
        }
    }
}
