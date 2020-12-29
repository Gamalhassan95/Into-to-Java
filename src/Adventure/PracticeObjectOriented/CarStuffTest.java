package Adventure.PracticeObjectOriented;

import java.util.ArrayList;
import java.util.Scanner;

public class CarStuffTest {
    public static void main(String[] args) {
        CarStuff myCarStuff = new CarStuff("Ferrari", "red", "sports", "yes", 1000);
        CarStuff myCarStuff2 = new CarStuff("lambo", "yellow", "sports", "yes", 1000);
        CarStuff myCarStuff3 = new CarStuff("bently", "black", "sports", "yes", 1000);
        ArrayList<CarStuff> myCars = new ArrayList<CarStuff>();
        myCars.add(myCarStuff);
        myCars.add(myCarStuff2);
        myCars.add(myCarStuff3);
        Boolean Found = false;

        for (CarStuff cars : myCars) {
            cars.displayMessage();
        }
        System.out.printf("What car name are you looking for?");
        Scanner input = new Scanner(System.in);
        String carName = input.nextLine();
        carName = carName.replace( "\n","" );
        System.out.printf("So your looking for %s\n", carName);
        /*Check if we have what he is looking for*/

        for (CarStuff cars : myCars) {
            System.out.println(cars.getCarName());
            String c = cars.getCarName();
            if (c == carName) {
                Found = true;
                System.out.println("Your lucky we have what you are looking for\n");
            }
        }
        if(Found != true){
            System.out.printf("car not found");
        }
    }
}



/*
first diplay the models
        second ask the user the model he wants
*/
