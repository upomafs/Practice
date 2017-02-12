import java.util.Scanner;

/**
 * Created by Upoma on 1/5/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double avg = 0.0;
        for (int i = 0; i < n; i++) {
            double mile, oil;
            mile = scanner.nextDouble();
            oil = scanner.nextDouble();
            System.out.println("Mileage for  trip " + (i + 1) + ": " + (mile / oil));
            avg += (mile / oil);
        }
        System.out.println("Average mileage: " + (avg / n));
    }
}
