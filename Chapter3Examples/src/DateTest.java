/**
 * Created by Upoma on 1/19/2017.
 */
public class DateTest {

    public static void main(String[] args) {
        Date d1 = new Date(01,04,1994);
        Date d2 = new Date(06,07,1993);
        System.out.println("Date 1 : "+d1.getMonth()+"/"+d1.getDate()+"/"+d1.getYear());
        System.out.println("Date 2 : "+d2.getMonth()+"/"+d2.getDate()+"/"+d2.getYear());
    }
}
