package Classes;

public class GradeBookTest3 {
    public static void main( String[] args)
    {
        GradeBook3 gradeBook1 = new GradeBook3( "CS101 Introduction to Java Programming");
        GradeBook3 gradeBook2 = new GradeBook3("CS102 Data Structures in Java");

        System.out.printf("gradeBook1 course name is: %s\n", gradeBook1.getCourseName() );
        System.out.printf("gradeBook2 course name is: %s\n", gradeBook2.getCourseName() );
    }
}
