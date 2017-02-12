/**
 * Created by Upoma on 1/28/2017.
 */
public class DaglingIfElsea {
    public static void main(String[] args) {
        int x = 11;
        int y = 9;
        if (x < 10)
            if (y > 10)
                System.out.println("*****");

         else
            System.out.println("#####");
            System.out.println("$$$$$");

        }
    }

