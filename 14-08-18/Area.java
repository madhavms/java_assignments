import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Area {

public static void main(String args[]){

Rectangle rectangle = new Rectangle(13.07, 2);
Circle circle = new Circle(6.87);
    System.out.println("Value of pi:"+Math.PI);
    System.out.println("Area of rectangle = " + rectangle.calculateAreaOfRectangle());
    System.out.println("Perimeter of rectangle = " + rectangle.calculatePerimeterOfRectangle());
    System.out.println("\nArea of circle = " + circle.CalcAreaCircle());
    System.out.println("Circumference = " + circle.calculateCircumferenceOfCircle());
}
}
class Circle
{
double radius;
static final double pi=Math.PI;

Circle(double radius){
    this.radius = radius;
}
double CalcAreaCircle(){
	NumberFormat numberFormatter = new DecimalFormat("#0.000000000");
    return Double.parseDouble(numberFormatter.format(pi*radius*radius));
}
double calculateCircumferenceOfCircle(){
	NumberFormat numberFormatter = new DecimalFormat("#0.00");
    return Double.parseDouble(numberFormatter.format(2*pi*radius));
}

class Rectangle
{
double length,breadth;
Rectangle(double length, double breadth){
    this.length = length;
    this.breadth = breadth;
}
double calculateAreaOfRectangle(){
	NumberFormat numberFormatter = new DecimalFormat("#0.00");
    return Double.parseDouble(numberFormatter.format(length * breadth));
}
double calculatePerimeterOfRectangle(){
    NumberFormat numberFormatter = new DecimalFormat("#0.00");
    return Double.parseDouble(numberFormatter.format(2 * (length+ breadth)));
}
}


}
