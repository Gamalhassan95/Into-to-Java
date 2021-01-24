package DemoPackage;

public class Shape {

    double radius;
    double height;
    double width;
    double diameter;
 //   double pi = 3.14;


    public void area(Double radius){
        Double area = Math.PI * Math.pow(radius,2);
        System.out.println("The area of the circle is: "+area);
    }
    public void area(Double height, double width){
        Double area = height * width;
        System.out.println("The area of the rectangle is: "+area);
    }

    public static void main(String [] args){
        Shape object = new Shape();
        object.area(3.0,4.0);
        object.area(3.0);
    }
}
