package PracticeObjectOriented;

/*Create a console app that:
        - uses arraylist to store car models
        Steps:
        1. create car object
        2. in car object class create methods to modify and get car properties
3. create main application class that makes use of the car object
4. the main class stores the cars in an arraylist of type cars
5. create methods to display cars available, get cars or particlar property e.g color, price*/

public class CarStuff
{
    private String CarName;
    private String CarColor;
    private String CarModel;
    private String Availability;
    private double CarSize;


    public CarStuff(String carName, String carColor, String carModel, String Availability, double carSize) {
        CarName = carName;
        CarColor = carColor;
        CarModel = carModel;
        this.Availability = Availability;
        CarSize = carSize;
    }

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String carName) {
        CarName = carName;
    }

    public String getCarColor() {
        return CarColor;
    }

    public void setCarColor(String carColor) {
        CarColor = carColor;
    }

    public String getCarModel() {
        return CarModel;
    }

    public void setCarModel(String carModel) {
        CarModel = carModel;
    }

    public double getCarSize() {
        return CarSize;
    }

    public void setCarSize(double carSize) {
        CarSize = carSize;
    }

    public String getAvailability() {
        return Availability;
    }

    public void setAvailability(String availability) {
        Availability = availability;
    }

    public void displayMessage(){
        System.out.printf("Your car name is %s, its color is %s, its model is %s, its car size %f\n\n",getCarName(),getCarColor(),
                getCarModel(),getCarSize(),getAvailability());
    }
}
