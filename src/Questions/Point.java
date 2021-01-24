package Questions;

public class Point
{
    double x ;
    double y ;


    public Point(){

    }

    public Point(double x, double y ){
        this.x = x;
        this.y = y;
    }

    public double distance(){
        double distance = Math.sqrt( Math.pow((this.x - 0), 2) + Math.pow((this.y - 0), 2));
        return distance;
    }

    public double distance(Point point){
        double distance = Math.sqrt( Math.pow((point.getX() - this.x), 2) + Math.pow((point.getY() - this.y), 2));
        return distance;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    public static void main(String [] args ){
        Point p1 = new Point(2,3);
        Point p2 = new Point(5,6);
        System.out.println("the distance from the origin is"+ p1.distance());
        System.out.println("distance between the two points"+ p2.distance(p1));

    }
}
