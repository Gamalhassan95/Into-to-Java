package Adventure.Inheritance.CarClassification;

public class Car {

    private long id;
    private double Price;
    private String Color;
    private String Brand;
    private String Origin;
    private boolean available = true;

    public Car( long id,double price, String color, String brand, String origin) {
        this.id = id;
        Price = price;
        Color = color;
        Brand = brand;
        Origin = origin;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return  "Car id: " + getId()+ "Made by: " + getBrand()+ "Made in : " + getOrigin() + "\nCost : " + getPrice() + "\n";
    }
}
