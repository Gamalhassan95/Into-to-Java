package Questions;

public class Switch
{
    public static void main( String [] args){
        Integer DOW = 10;

        switch(DOW){
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tues");
                break;
            case 3:
                System.out.print("W");
                break;
            case 4:
                System.out.print("TH");
                break;
            case 5:
                System.out.print("F");
                break;
            case 6:
                System.out.print("SAT");
                break;
            case 7:
                System.out.print("SUN");
                break;
            default:
                System.out.print("please provide the correct input");


        }
    }
}
