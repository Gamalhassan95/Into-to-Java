package Classes;
    import java.util.Scanner;
public class GradeBookTest1 {
        public static void main( String[] args )
        {

            Scanner input = new Scanner( System.in );

            GradeBook1 myGradeBook = new GradeBook1();

            System.out.println( "Please enter the course name:" );
            String nameOfCourse = input.nextLine();
            System.out.println();


            myGradeBook.displayMessage( nameOfCourse );
        }
}

