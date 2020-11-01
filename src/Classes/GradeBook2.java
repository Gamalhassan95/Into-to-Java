package Classes;

public class GradeBook2{

    private String courseName;
    private String courseInstructor;

        public GradeBook2( String courseName ,String courseInstructor) // This is a setter methode. Setter methods set the values of object attributes
    {
        this.courseName = courseName;
            this.courseInstructor = courseInstructor;
    }
    public void setCourseName( String courseName) // setter
    {
        this.courseName = courseName;
    }

    public void setCourseInstructor(String courseInstructor) // setter
    {
        this.courseInstructor = courseInstructor;
    }

    public String getCourseName() // This is a getter methode. Setter methods get the values of object attributes
    {
        return courseName;
    }
    public String getCourseInstructor() // This is a getter methode. Setter methods get the values of object attributes
    {
        return courseInstructor;
    }
    public void displayMessage()
    {

        System.out.printf( "Welcome to the grade book for \n%s!\n", getCourseName() );
        System.out.printf( "This course is presented by: %s!\n", getCourseInstructor() );
    }
}
