/**
 * Created by Upoma on 1/16/2017.
 */
public class GradeBook {
    private String courseName;
    private String courseInstructor;

    public GradeBook(String name, String nameIns) {
        courseName = name;
        courseInstructor = nameIns;
    }

    public void setCourseName(String name) {
        courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseInstructorName(String nameIns) {
        courseInstructor = nameIns;
    }

    public String getCourseInstructorName() {
        return courseInstructor;
    }

    public void displayMessagees() {
        System.out.println("Welcome to the grade book of : " + getCourseName());
        System.out.println("Your Course Instructor Name : " + getCourseInstructorName());
    }
}

