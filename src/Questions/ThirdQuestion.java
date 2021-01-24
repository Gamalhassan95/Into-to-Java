package Questions;

public class ThirdQuestion
{
     public static void main(String [] args) {
          int num1 = 1;
          int num2 = 2;
          int num3 = 3;
          int largest = 1;


          if(num1 > num2 && num1 > num3)
               largest = num1;
          else if(num2 > num1 && num2 > num3)
               largest = num2;
          else
               largest = num3;
          System.out.print(largest);
     }
}
