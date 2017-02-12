import java.util.Scanner;

/**
 * Created by Upoma on 2/4/2017.
 */
public class CarryOutAddition {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int n, m;
            System.out.println("Enter two integers to add(-1 to exit): ");
            n = sc.nextInt();
            m = sc.nextInt();
            if(n==-1&&m==-1)break;
            else{
                int car = carryAddition(n,m);
                System.out.println("The value of the addition = "+ car);
            }

        }
    }static int carryAddition(int n,int m) {

            int tempN, tempM, retN,retM, added,val=0,carry;
            tempN = n;
            tempM = m;
            while (tempN > 0 && tempM > 0) {
                retN=tempN%10;
                retM=tempM%10;
                added=retN+retM;
                if(added>9) {

                    carry=added/10;retN+=carry;
                    added=added%10;
                    val=added;


                }
                else{
                    val=added;
                }
                tempN/=10;
                tempM/=10;


            }
            return  val;

        }
    }