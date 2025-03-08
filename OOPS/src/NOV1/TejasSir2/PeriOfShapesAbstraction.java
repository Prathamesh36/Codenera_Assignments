/*Q3.Create a class called "Shape" with an abstract method calculatePerimeter().
 Implement subclasses "Rectangle" and "Circle" that override the calculatePerimeter() method.
 Create a third subclass "ShapeCollection" that contains an Array of Shape objects
 and implement a method to find the shape with the largest perimeter in the collection.
*/
package NOV1.TejasSir2;

import java.util.Scanner;

abstract class Shape1{
    abstract int calculatePerimeter();
}
class Rectangle1 extends Shape1{
    int length;
    int width;
    public Rectangle1(int length,int width){
        this.length=length;
        this.width=width;
    }
    int calculatePerimeter(){
        return 2*(length+ width);
    }
}
class Circle extends Shape1{
    int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    int calculatePerimeter(){
        int peri=(int)(2*3.14*radius);
        return peri;
    }
}
class ShapeCollection1{
    Shape1[] a;
    public ShapeCollection1(Shape1[] a){
        this.a=a;
    }/*
    public int largestperi(){
        int max= 0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max= a[i].calculatePerimeter();
            }
        }
        return max;
    }*/
}

public class PeriOfShapesAbstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape1 [] shapes = new Shape1[2];
        System.out.print("Enter length of rectangle: ");
        int h = sc.nextInt();
        System.out.print("Enter width of rectangle: ");
        int w = sc.nextInt();
        shapes[0]= new Rectangle1(h,w);
        System.out.print("Enter radius of circle: ");
        int r= sc.nextInt();
        shapes[1]= new Circle(r);
        ShapeCollection1 collection = new ShapeCollection1(shapes);
      /*  int Peri = collection.largestperi();
        System.out.println("Total Area: "+Peri);*/

    }
}
