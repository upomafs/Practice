/**
 * Created by Upoma on 1/19/2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new Employee("Tabassum","Upoma", 150.90);
        Employee e2 = new Employee("Fahim","Rafi", 136.87);

        System.out.println("Yearly Salary of Upoma : "+e1.yearlySal());
        System.out.println("Yearly Salary of Fahim : "+e2.yearlySal());

        System.out.println("Increment Yearly salary of Upoma : "+ e1.incrementSal());
        System.out.println("Increment Yearly salary of Fahim : "+ e2.incrementSal());


    }
}
