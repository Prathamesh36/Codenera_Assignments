/*1. Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle,
Circle, and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes.
 */

package NOV2.TejasSir;

import java.util.Scanner;

interface Shape{
    public double getArea();
}
class Rectangle implements Shape{
    public double getArea(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of rectangle: ");
        int h = sc.nextInt();
        System.out.print("Enter width of rectangle: ");
        int w = sc.nextInt();
        double area = h*w;
        return area;
    }
}
class Circle implements Shape{
    public double getArea(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        int r = sc.nextInt();
        double area = 3.14*r*r;
        return area;
    }
}
class Triangle implements Shape{
    public double getArea(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of triangle: ");
        int h = sc.nextInt();
        System.out.print("Enter base of triangle: ");
        int b = sc.nextInt();
        double area = 0.5*(b*h);
        return area;
    }
}

public class ShapesInterface {
    public static void main(String[] args) {
        Shape ob = new Rectangle();
        System.out.println("Area of rectangle is: "+ob.getArea());
        Shape ob1 = new Circle();
        System.out.println("Area of Circle is: "+ob1.getArea());
        Shape ob2 = new Triangle();
        System.out.println("Area of Triangle is: "+ob2.getArea());
    }
}
