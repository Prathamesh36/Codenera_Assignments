/*Q1.Create a class called "Shape" with an abstract method calculateArea().
Implement subclasses "Rectangle" and "Triangle" that override the calculateArea() method.
Create a third subclass "ShapeCollection" that contains an Array of Shape objects and implement
a method to calculate the total area of all the shapes.
*/
package NOV1.TejasSir2;

import java.util.Scanner;

abstract class Shape{
    abstract int calculateArea();
}

class Rectangle extends Shape{
    int length;
    int width;
    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    int calculateArea(){
        return length* width;
    }
}
class Triangle extends Shape{
    int base;
    int height;
    public Triangle(int height,int base){
        this.base=base;
        this.height=height;
    }
    int calculateArea(){
        return (base*height)/2;
    }
}
class ShapeCollection{
    Shape[] a;
    public ShapeCollection(Shape[] a){
        this.a=a;
    }
    public int totalArea(){
        int totalArea= 0;
        for(int i=0;i<a.length;i++){
            totalArea+=a[i].calculateArea();
        }
        return totalArea;
    }
}

public class AreaOfShapesAbstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape [] shapes = new Shape[2];
        System.out.print("Enter height of rectangle: ");
        int h = sc.nextInt();
        System.out.print("Enter width of rectangle: ");
        int w = sc.nextInt();
        shapes[0]= new Rectangle(h,w);
        System.out.print("Enter height of triangle: ");
        int h1= sc.nextInt();
        System.out.print("Enter base of triangle: ");
        int b = sc.nextInt();
        shapes[1]= new Triangle(h1,b);
        ShapeCollection collection = new ShapeCollection(shapes);
        int totalArea = collection.totalArea();
        System.out.println("Total Area: "+totalArea);

    }
}
