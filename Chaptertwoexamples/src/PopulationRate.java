/**
 * Created by Upoma on 1/10/2017.
 */
public class PopulationRate {
    public static void main(String[] args) {
        long current_world_Pop=7000000000L;
        double annual_grwoth_rate =0.01;
        long cp1,cp2,cp3,cp4,cp5;

        cp1 =(long)(current_world_Pop+(current_world_Pop*annual_grwoth_rate));
        cp2 =(long)(cp1+(cp1*annual_grwoth_rate));
        cp3 =(long)(cp2+(cp2*annual_grwoth_rate));
        cp4 =(long)(cp3+(cp3*annual_grwoth_rate));
        cp5 =(long)(cp4+(cp4*annual_grwoth_rate));

    System.out.println("Estimated population in first year = " +cp1);
    System.out.println("Estimated population in second year = " +cp2);
    System.out.println("Estimated population in third year = " +cp3);
    System.out.println("Estimated population in fourth year = " +cp4);
    System.out.println("Estimated population in fifth year = " +cp5);


    }
}
