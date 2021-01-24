package Questions;

public class Loop
{
    public static void main(String [] args){
        int num = 5;
        int counter = 1;
        int total = 0;
        String [] arry = {"a","e","i","o","u"};
/*        while( counter < num){
            total = total + num;
            num--;

        }
        System.out.print(total);*/
/*        do{
            total = total + num;
            num--;
        }while(counter < num);

        System.out.print(total);*/

        for (String x:arry
             ) {
            System.out.printf(x);
        }
        for(counter = 0; counter <= num;counter++){
            total = total + counter;
            System.out.println(counter);
        }
        System.out.println(total);
        System.out.println(counter);
    }
}
