package Classes;
import java.util.Scanner;

public class GradeBookTest2 {
    public static void main( String[] args)
    {

        Scanner input = new Scanner( System.in );

        GradeBook2 myGradeBook = new GradeBook2("g", "h" );

        System.out.printf("Initial course name is: %s\n\n", myGradeBook.getCourseName() );
        System.out.printf("Initial course Instructor is: %s\n\n", myGradeBook.getCourseInstructor());

        System.out.println("Please enter the course name:" );
        String theName = input.nextLine();

        System.out.println("Please enter the Instructor name:" );
        String theInstructor = input.nextLine();

        myGradeBook.setCourseName( theName );
        myGradeBook.setCourseInstructor( theInstructor);
        System.out.println();

        myGradeBook.displayMessage();
    }
}
