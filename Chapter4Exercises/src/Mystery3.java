/**
 * Created by Upoma on 1/28/2017.
 */
public class Mystery3 {
    public static void main(String[] args) {
int row =10;
int column=1;
while(row>=1)
column=1;
while (column<=10)
{
System.out.println(row%2==0?"<":">");
 ++column;}
row--;
        System.out.println();
}
}