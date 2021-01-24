package Questions;

public class FirstProblem {


    public static void main( String [] args)
    {
        int target = 10;
        int Factorial = 1;

        while (target > 1) {
            Factorial = Factorial * target ;
            target = target - 1;
        }
        System.out.print(Factorial);
    }
}
