/**
 * Created by Upoma on 1/19/2017.
 */
public class HeartRateTest {
    public static void main(String[] args) {
        HeartRate hr1 = new HeartRate("Sayeda","Monira",04,01,1994);
        System.out.println("First Name of the patient : "+ hr1.getFirstName());
        System.out.println("Last Name of the patient : "+hr1.getLastName());
        System.out.println("Date of Birth : "+hr1.getDateOfBirth()+"/"+hr1.getMonthOfBirth()+"/"+hr1.getYearOfBirth());
        System.out.println("Patient's age : "+ hr1.ageCalculation());
        System.out.println("Patient's Maximum Heart Rate : "+ hr1.maximumHeartRate());
        System.out.println("Patient's target Heart Rate : "+hr1.targetHeartRate());

    }

}
