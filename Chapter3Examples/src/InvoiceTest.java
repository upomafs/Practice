/**
 * Created by Upoma on 1/17/2017.
 */
public class InvoiceTest {
    public static void main(String[] args) {
        Invoice in1 = new Invoice("07-0", "Monitor", 5,20.78  );
        Invoice in2 = new Invoice("07-1","CPU",7,-90.98);
        Invoice in3 = new Invoice("07-2","Hard Drive",-9,89);
        System.out.println("The total invoice number for first product = "+ in1.getInvoiceAmount());
        System.out.println("The total invoice number for second product = "+ in2.getInvoiceAmount());
        System.out.println("The total invoice number for third product = "+ in3.getInvoiceAmount());

    }
}
