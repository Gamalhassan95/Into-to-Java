package ControlStatements;

public class GradeBookTest
{
    public static void main( String[] args)
    {
        GradeBook myGradeBook = new GradeBook( "CS101 Introduciton to Java Programming" );

        myGradeBook.displayMessage();
        myGradeBook.determineClassAverage();
        myGradeBook.setCourseName("Java");
        myGradeBook.displayMessage();
    }
}
