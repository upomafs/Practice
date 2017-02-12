import java.util.Scanner;

/**
 * Created by Upoma on 1/11/2017.
 */
public class CarPoolSavingCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float totalmiles;
        float costpergallon;
        float avgmilespergallon;
        float parkingfees;
        float tollsperday;
        float dailyDrivingcost;
        System.out.println("Enter Total Miles driven per day = ");
        totalmiles = sc.nextFloat();
        System.out.println("Enter cost per gallon of gasoline = ");
        costpergallon = sc.nextFloat();
        System.out.println("Enter average miles per gallon = ");
        avgmilespergallon = sc.nextFloat();
        System.out.println("Enter Parking fees per day = ");
        parkingfees = sc.nextFloat();
        System.out.println("Enter Tolls per day =");
        tollsperday = sc.nextFloat();

        dailyDrivingcost = (totalmiles/avgmilespergallon)*costpergallon+parkingfees+tollsperday;

        System.out.println("Daily Car pooling cost = "+ dailyDrivingcost);


    }
}
