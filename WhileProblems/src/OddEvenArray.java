/**
 * Created by Upoma on 2/13/2017.
 */
public class OddEvenArray {
    public static void main(String[] args) {
        int n=1;
        int counter=1;
        int i;
        int []arr=new int [20];
        for ( i=1;i<arr.length;i++){

            while(n!=1){
                if (i % 2 == 0) n = n / 2;
                else n = 3 * n + 1;
                counter++;

            }
            arr[i]=counter;
            System.out.println(n +"\t"+ arr[i]);
            n++;

        }

    }
}
