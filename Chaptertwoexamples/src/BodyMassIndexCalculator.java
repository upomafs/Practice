import java.util.Scanner;

/**
 * Created by Upoma on 1/10/2017.
 */
public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float weight_kg;
        float height_meter;
        float BMI;
        System.out.println("Enter weight in kg and height in meter unit");
        weight_kg = sc.nextInt();
        height_meter=sc.nextInt();
        BMI =weight_kg/(height_meter*height_meter);
        System.out.println("Body mass index value= "+ BMI);

        if(BMI<18.5) {
            System.out.println("BMI value indicates underweight range");
        }

        if(18.5<=BMI&&BMI<=24.9){
            System.out.println("BMI value indicates normal range");
        }

        if(25<=BMI&&BMI<=29.9) {
         System.out.println("BMI value indicates overweight range");
        }

        if(BMI>=30){
            System.out.println("BMI value indicates Obese range");
        }

    }
}
