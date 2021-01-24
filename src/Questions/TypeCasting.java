package Questions;

public class TypeCasting
{
    public static void main( String [] args){
        int num1 = 10;
        double num2 = num1; /*Widening Casting or Automatic Casting*/

        System.out.println( num2);
        System.out.println(num1);

        double num3 = 3;
        int num4 = (int) num3; /* narrowing casting*/
        System.out.println(num3);
        System.out.println(num4);
    }
}
