/**
 * Created by Upoma on 1/17/2017.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySal;

    public Employee(String firstN, String lastN, double monthS)

    {
        firstName = firstN;
        lastName = lastN;

        if (monthS < 0.0) {
            monthlySal=0.0;
        }
        else
            monthlySal=monthS;
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


    public void setMonthlySal(double monthS) {
        this.monthlySal = monthS;
    }


    public double getMonthlySal() {
        return monthlySal;
    }
    public  double yearlySal()
    {
        double yearlySalary = 12*monthlySal;
        return  yearlySalary;
    }
    public double incrementSal()
    {
        double incrmentedSal = 10*yearlySal();
        return  incrmentedSal;
    }
}