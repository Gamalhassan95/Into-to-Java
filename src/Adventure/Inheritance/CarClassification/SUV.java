package Adventure.Inheritance.CarClassification;

public class SUV extends Car {

    protected boolean hasSlidingDoor = false;
    private int numSeats;
    protected boolean isSports = false;

    public SUV(long id, double price, String color, String brand, String origin, boolean hasSliddingDoor, int numSeats, boolean isSports) {
        super(id, price, color, brand, origin);
        this.hasSlidingDoor = hasSliddingDoor;
        this.numSeats = numSeats;
        this.isSports = isSports;
    }

    public boolean isHasSliddingDoor() {
        return hasSlidingDoor;
    }

    public void setHasSliddingDoor(boolean hasSliddingDoor) {
        this.hasSlidingDoor = hasSliddingDoor;
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

    @Override
    public String toString() {
        return super.toString() + "\nHas " + getNumSeats() + " number of seats\n" +
                "Has sliding door: " + isHasSliddingDoor() +
                "Is sporty: " + isSports;

    }
}
