package Adventure.Inheritance.CarClassification;

public class Berlin extends Car{

    private int numSeats;
    private boolean isConvertible = false;
    protected boolean isSports = false;


    public Berlin(long id, double price, String color, String brand, String origin, int numSeats, boolean isConvertible, boolean isSports) {
        super(id, price, color, brand, origin);
        this.numSeats = numSeats;
        this.isConvertible = isConvertible;
        this.isSports = isSports;
    }


    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public boolean isSports() {
        return isSports;
    }

    public void setSports(boolean sports) {
        isSports = sports;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }

    @Override
    public String toString() {
        return super.toString() + "\nnumber of seats\n" +
                "Is convertible: " + isConvertible() +
                "Is sporty: " + isSports;
    }
}
