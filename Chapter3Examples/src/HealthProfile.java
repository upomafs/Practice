/**
 * Created by Upoma on 1/19/2017.
 */
public class HealthProfile {
    private  String firstName;
    private String lastName;
    private  int dateOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String gender;
    private double heightInInches;
    private double weightInPound;
    public int currentAge;
    public int maxHR;

    public HealthProfile(String firstN,String lastN,String gen,int dOB,int mOB,int yOB,double heightInInc,double weightInP)
    {
        firstName=firstN;
        lastName=lastN;
        gender=gen;
        dateOfBirth=dOB;
        monthOfBirth=mOB;
        yearOfBirth=yOB;
        heightInInches=heightInInc;
        weightInPound=weightInP;

    }
    public void setFirstName(String firstN) {
        firstName = firstN;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastN) {
        lastName = lastN;
    }

    public String getLastName() {
        return lastName;
    }
    public void setGender(String gen)

    {
        gender = gen;
    }

    public String getGender() {
        return gender;
    }

    public void setDateOfBirth(int dOB) {
        this.dateOfBirth = dOB;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setMonthOfBirth(int mOB) {
        monthOfBirth = monthOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setYearOfBirth(int yOB) {
        yearOfBirth = yOB;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setHeightInInches(double heightInInc) {
        heightInInches = heightInInc;
    }

    public double getHeightInInches() {
        return heightInInches;
    }

    public void setWeightInPound(double weightInP) {
        weightInPound = weightInP;
    }

    public double getWeightInPound() {
        return weightInPound;
    }

    public int ageCalculation()
    {
        currentAge =2017-yearOfBirth;
        return  currentAge;
    }
    public int maximumHeartRate() {
        maxHR = 220 - currentAge;
        return maxHR;
    }
    public String targetHeartRate()
    {
        int targetHrMin= (int)(.50*maxHR);
        int targetHrMax=(int)(.85*maxHR);
        String targetHeartRate = "between "+targetHrMin+" and "+targetHrMax;
        return  targetHeartRate;
    }
    public double BMICalculation()
    {
        double bmiVal= (weightInPound*730)/(heightInInches*heightInInches);
        return bmiVal;

    }

}
