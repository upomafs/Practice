import java.util.Scanner;

/**
 * Created by Upoma on 2/12/2017.
 */
public class OddEvenAddtionSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=1;

        while (n>0){
            System.out.print("Enter an input = ");
            n=sc.nextInt();
            if(n<0)break;
            oddEvenAddition(n);
        }

    }
    public static void oddEvenAddition(int n){
        int temp;
        temp=n;
        System.out.print(n);
        while(temp!=1){
            if(temp%2==0) temp=temp/2;
            else  temp= 3*temp+1;
            System.out.print(" " + temp);
        }
        System.out.println();
    }
}
//fisrt er ta