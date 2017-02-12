/**
 * Created by Upoma on 1/19/2017.
 */
public class HeartRate {
    private  String firstName;
    private String lastName;
    private  int dateOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    public int currentAge;
    public int maxHR;
    public HeartRate(String firstN,String lastN ,int dOB,int mOB,int yOB){

        firstName=firstN;
        lastName=lastN;
        dateOfBirth=dOB;
        monthOfBirth=mOB;
        yearOfBirth=yOB;

    }

    public void setFirstName(String firstN) {
        firstName = firstN;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastN) {
        this.lastName = lastN;
    }

    public String getLastName() {
        return lastName;
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

}
