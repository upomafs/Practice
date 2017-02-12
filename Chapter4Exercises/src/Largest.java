import java.util.Scanner;

/**
 * Created by Upoma on 1/26/2017.
 */
public class Largest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int counter=1;
        int number=0 ;
        int largest=number;



        while(counter<=10)
        {
          number = sc.nextInt();

           if(number>largest){ largest=number;}
            counter ++;
        }
     System.out.println("The largest of all is "+ largest);

    }

}
