package Questions;

public class SecondQuestion
{
    public static void main( String [] args) {
        int rows = 5;
        int i = 1;
        int x = 1;

        for(i = 0;i<rows;i++){
                for( x = -1; x < i; x++){
                    System.out.printf("*");
                }
            System.out.println();
        }
    }
}
