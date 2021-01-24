package Questions;
import java.lang.Math;

import static java.lang.StrictMath.sqrt;

public class Quadratic
{
    public static void main ( String [] args){
        int a  = 1;
        int b =  4;
        int c = 4;



        if(discriminant(a,b,c) == 0){
            System.out.println(roots(a,b,c)[0]);
        }
        else if(discriminant(a,b,c) > 0){
            System.out.println(roots(a,b,c)[0]);
            System.out.println(roots(a,b,c)[1]);
        }
        else//System.out.print(discriminant);
        System.out.println("The roots are not real");
    }

    public static double discriminant(int a, int b ,int c){
        double discriminant = (b*b) - 4*a*c;
        return discriminant;
    }
    public static double[] roots(int a, int b ,int c){
        double x_1 = (-b + sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
        double x_2 = (-b - sqrt(Math.pow(b, 2)- 4*a*c))/(2*a);
        return new double[] {x_1,x_2};
    }
}
