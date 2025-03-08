/*3. Write a Java program to create a base class Shape with a method called calculateArea().
Create three subclasses: Circle, Rectangle, and Triangle. Override the calculateArea() method in
each subclass to calculate and return the shape's area.
*/
package OCT30.TejasSir;
import java.util.Scanner;

class Shape{
    public void calculateArea(){
        System.out.println("Area of shapes");
    }
}
class Circle extends Shape{
    public void calculateArea(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter radius: ");
        int r = sc.nextInt();
        System.out.println("Area of circle is: "+(double)(3.14*r*r));
    }
}
class Rectangle extends Shape{
    public void calculateArea(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter height of rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter width of rectangle: ");
        int w = sc.nextInt();
        System.out.println("Area of rectangle is: "+(double)(l*w));
    }
}
class Triangle extends Shape{
    public void calculateArea(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter height of triangle: ");
        int l = sc.nextInt();
        System.out.print("Enter base of triangle: ");
        int w = sc.nextInt();
        System.out.println("Area of triangle is: "+(double)(0.5*l*w));
    }
}
public class POLY_Shape_Overriding {
    public static void main(String[] args) {
        Shape ob = new Circle();
        Shape ob1 =new Rectangle();
        Shape ob2 =new Triangle();
        ob.calculateArea();
        ob1.calculateArea();
        ob2.calculateArea();
    }
}
