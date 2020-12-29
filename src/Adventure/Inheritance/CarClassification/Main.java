package Adventure.Inheritance.CarClassification;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static ArrayList<Berlin> berlins = new ArrayList<Berlin>();
    static ArrayList<SUV> suvs = new ArrayList<SUV>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

       boolean play = true;
        init();
        menu();
       while( play == true)
       {
           int userchoice = scan.nextInt();

           if(userchoice == 1)
               createCar();
           else if (userchoice == 2)
               delete();
           else if (userchoice == 3)
           {
               System.out.println("Whats cars will you want to check?\n 0.Both Berlins and SUvs\n 1. Berlins,\n2. SUVs");
               int carchoice = scan.nextInt();
               display(carchoice);
           }

           System.out.println("You want to continue true or false?");
           play = scan.nextBoolean();
           if(play)
               menu();
       }

        System.out.println("Thanks for playing!");



    }

    public static void menu ()
    {
        System.out.println("Hello and welcomed\n In this app you can: \n1. Create cars\n2. Delete cars\n 3. view specific types of cars");
        System.out.println("What will you like to do (1, 2 or 3)");
    }

    public static  void init()
    {
        Berlin s2015 = new Berlin(1,25000, "Black","Mercedes", "Germany", 4, false, true );
        Berlin e2015 = new Berlin(2,15000, "Red","Mercedes", "Germany", 2, true, true );
        Berlin c2015 = new Berlin(3,17000, "Grey","Mercedes", "Germany", 4, false, true );

        Berlin Corolla = new Berlin(4,21000, "Black","Toyota", "Japan", 4, false, true );
        Berlin Matrix = new Berlin(5,17000, "Red","Toyota", "Japan", 2, true, true );
        Berlin Caranas = new Berlin(6,15000, "Grey","Toyota", "Japan", 4, false, true );

        Berlin F20 = new Berlin(7,21000, "Black","Ford", "USA", 4, false, true );
        Berlin F30 = new Berlin(8,17000, "Black","Ford", "USA", 2, true, true );
        Berlin F50 = new Berlin(9,15000, "Black","Ford", "USA", 4, false, true );

        SUV s50 = new SUV(1,150000, "Black","Ford", "USA", false, 8, true );
        SUV s30 = new SUV(2,130000, "Blue","Ford", "USA", false, 8, true );
        SUV s20 = new SUV(3,170000, "Red","Ford", "USA", false, 8, true );



        berlins.addAll(Arrays.asList(s2015,e2015,c2015, Corolla,Matrix, Caranas, F20,F30,F50));
        suvs.addAll(Arrays.asList(s20, s30, s50));
    }

    public static void display(int choice)
    {
        if( choice == 0)
        {
            System.out.println("Below are all the available Berlins");
            for ( Berlin b: berlins ) {

                System.out.println(b);
            }
            System.out.println("\n\nBelow are all the available SUVs");
            for ( SUV s:
                  suvs) {
                System.out.println(s);
            }
        }
        else if ( choice == 1)
        {
            for ( Berlin b: berlins ) {
                System.out.println(b);
            }
        }
        else if ( choice == 2)
        {
            for ( SUV s:
                    suvs) {
                System.out.println(s);
            }
        }
        else
        {
            System.out.println("Your option is invalid.");
        }
    }

    public static Object createCar()
    {
        System.out.println("Is your car a Berlin or Suv? Enter 1 or 2 respectively");
        
        int choice = scan.nextInt();
        
        if(choice == 1)
        {
            System.out.println("Enter the properties of your berlin:");
            System.out.print("Price: ");
             double Price = scan.nextDouble();
            System.out.println("Color: ");
             String Color = scan.nextLine();
            System.out.print("Brand: ");
             String Brand = scan.nextLine();
            System.out.print("Origin: ");
             String Origin = scan.nextLine();
            System.out.print("Number of seats: ");
            int numSeats = scan.nextInt();
            System.out.print("Is it a convertible car? (true or false): ");
            boolean isConvertible = scan.nextBoolean();
            System.out.print("Is it a sport car? (true or false): ");
            boolean isSport = scan.nextBoolean();

            try{
                Berlin userBerlin =  new Berlin(berlins.size()+1, Price, Color, Brand, Origin, numSeats, isConvertible, isSport);

                berlins.add(userBerlin);

                return "Your berlie was successively created. Below are its details\n" + userBerlin +"\n";
            }
            catch (Exception e)
            {
                return "The following error occured :(\n" +e;
            }


        }
        else  if(choice == 2)
        {
            System.out.println("Enter the properties of your SUV:");
            System.out.print("Price: ");
            double Price = scan.nextDouble();
            System.out.println("Color: ");
            String Color = scan.nextLine();
            System.out.print("Brand: ");
            String Brand = scan.nextLine();
            System.out.print("Origin: ");
            String Origin = scan.nextLine();
            System.out.print("Number of seats: ");
            int numSeats = scan.nextInt();
            System.out.print("Does it have a sliding door? (true or false): ");
            boolean hasSlidingDoor = scan.nextBoolean();
            System.out.print("Is it a sport car? (true or false): ");
            boolean isSport = scan.nextBoolean();

            try{
                SUV userSuv =  new SUV(suvs.size()+1, Price, Color, Brand, Origin, hasSlidingDoor, numSeats,  isSport);

                suvs.add(userSuv);

                return "Your SUV was successively created. Below are its details\n" + userSuv +"\n";
            }
            catch (Exception e)
            {
                return "The following error occured :(\n" +e;
            }


        }
        return "Your choice is invalid!";
    }

    public static void delete()
    {
        System.out.println("Do you want to delete a berlin or an SUV? (1 or 2) ");
        int userchoice = scan.nextInt();

        if(userchoice == 1)
        {
            display(userchoice);
            System.out.println("Which berlin will you link to delete (choice by id)");
            int id = scan.nextInt();
            berlins.remove(id -1);

            System.out.println("Below are the leftover berlins");
            display(userchoice);
        }
        else if(userchoice == 2)
        {
            display(userchoice);
            System.out.println("Which SUV will you link to delete (choice by id)");
            int id = scan.nextInt();
            suvs.remove(id -1);

            System.out.println("Below are the leftover SUVs");
            display(userchoice);
        }

    }
}
