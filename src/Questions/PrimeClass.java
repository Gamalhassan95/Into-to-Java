package Questions;
import java.lang.Math;

public class PrimeClass {

    public static void main(String [] args)
    {        Integer num1 = 53;
                test(num1);
    }
    public static void test(int num1){

        Double num2 = Math.sqrt(num1);
        Boolean NotPrime = false;
        num2 = Math.floor(num2);

        System.out.print(num2);
        int x = 2;
        while (x < num2) {
            if (num1 % x == 0) {
                NotPrime = true;
            }
            x++;
        }
        if (NotPrime == true)
            System.out.print("This is not a prime number");
        else
            System.out.print("This is a prime");
    }
}
