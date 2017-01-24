/**
 * Created by Upoma on 1/19/2017.
 */
public class HealthProfileTest {
    public static void main(String[] args) {
        HealthProfile hp1 = new HealthProfile("Sayeda", "Monira","Female",04,01,1994,60.65,140);
        System.out.println("First Name of the patient : "+ hp1.getFirstName());
        System.out.println("Last Name of the patient : "+hp1.getLastName());
        System.out.println("Gender : "+ hp1.getGender());
        System.out.println("Date of Birth : "+hp1.getDateOfBirth()+"/"+hp1.getMonthOfBirth()+"/"+hp1.getYearOfBirth());
        System.out.println("Patient's age : "+ hp1.ageCalculation());
        System.out.println("Patient's height in inches : "+ hp1.getHeightInInches());
        System.out.println("Patient's weight in pounds : "+ hp1.getWeightInPound());
        System.out.println("Patient's Maximum Heart Rate : "+ hp1.maximumHeartRate());
        System.out.println("Patient's target Heart Rate : "+hp1.targetHeartRate());
        System.out.println("Body Mass Index Value : "+hp1.BMICalculation());

        if(hp1.BMICalculation()<18.5) {
            System.out.println("BMI value indicates underweight range");
        }

        if(18.5<=hp1.BMICalculation()&&hp1.BMICalculation()<=24.9){
            System.out.println("BMI value indicates normal range");
        }

        if(25<=hp1.BMICalculation()&& hp1.BMICalculation()<=29.9) {
            System.out.println("BMI value indicates overweight range");
        }

        if(hp1.BMICalculation()>=30){
            System.out.println("BMI value indicates Obese range");
        }
    }
}
