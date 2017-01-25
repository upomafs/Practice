import java.util.Scanner;

/**
 * Created by Upoma on 1/19/2017.
 */
public class HealthProfileTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String firstN;
        String lastN;
        String gen;
        int dOB;
        int mOB;
        int yOB;
        double heightInInc;
        double weightInP;
        HealthProfile hp1 = new HealthProfile();
        System.out.println("Enter First Name of the patient : ");
        firstN=sc.next();
        hp1.setFirstName(firstN);
        System.out.println("Enter Last Name of the patient : ");
        lastN=sc.next();
        hp1.setLastName(lastN);
        System.out.println(" Enter Gender of the patient : ");
        gen=sc.next();
        hp1.setGender(gen);
        System.out.println("Enter Date of Birth by date, month and year format:");
        dOB=sc.nextInt();
        hp1.setDateOfBirth(dOB);
        mOB=sc.nextInt();
        hp1.setMonthOfBirth(mOB);
        yOB=sc.nextInt();
        hp1.setYearOfBirth(yOB);
        System.out.println("Patient's age : "+hp1.ageCalculation());
        System.out.println("Patient's height in inches : ");
        heightInInc=sc.nextDouble();
        hp1.setHeightInInches(heightInInc);
        System.out.println("Patient's weight in pounds : ");
        weightInP=sc.nextDouble();
        hp1.setWeightInPound(weightInP);
        System.out.println("Patient's Maximum Heart Rate : "+ hp1.maximumHeartRate());
        System.out.println("Patient's target Heart Rate : "+hp1.targetHeartRate());
        System.out.println("Body Mass Index Value : "+hp1.BMICalculation());
        System.out.println("According to Calculation your "+hp1.BMIValue());


    }
}
