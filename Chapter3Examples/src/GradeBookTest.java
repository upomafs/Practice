/**
 * Created by Upoma on 1/16/2017.
 */
public class GradeBookTest {
    public static void main(String[] args) {
        GradeBook gr1 = new GradeBook("Java","Tabassum");
        GradeBook gr2 = new GradeBook("PhP", "Fahim");
        System.out.println("This is grade book 1: "+ gr1.getCourseName());
        System.out.println("This is taken by: "+ gr1.getCourseInstructorName());
        System.out.println("This is grade book 2: "+ gr2.getCourseName());
        System.out.println("This is taken by: "+gr2.getCourseInstructorName());


    }

}
