package Questions;

public class Recurrsion
{
    public static void main(String [] args){
        int num1 = 3;
        System.out.print(factorial(num1));
    }
    public static int factorial(int num1){
        if (num1 == 0)
            return 1;
        else
            return num1 * factorial(num1 - 1);
}
}
