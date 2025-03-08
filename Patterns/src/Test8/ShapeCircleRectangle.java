/*7.Design a class hierarchy in Java representing different shapes, including a base class "Shape" and derived
classes like "Circle" and "Rectangle." Include methods to calculate the area of each shape.*/
package Test8;

import java.util.Scanner;

class Shape{
    public double Area(int l,int w){
        double area = l*w;
        return area ;
    }
    public double Area(int r){
        double area = 3.14*r*r;
        return area ;
    }
}
class Circle extends Shape{
    public void circle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int r = sc.nextInt();
        System.out.print("Area of Circle is: "+Area(r));
    }
}
class Rectangle extends Shape{

    public void rectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter length of rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter width of rectangle: ");
        int w = sc.nextInt();
        System.out.print("Area of rectangle is: "+Area(l,w));

    }
}

public class ShapeCircleRectangle {
    public static void main(String[] args) {
        Circle clr = new Circle();
        Rectangle rec= new Rectangle();
        clr.circle();
        rec.rectangle();
    }
}
/***********************OUTPUT*************************
 Enter radius: 4
 Area of Circle is: 50.24
 Enter length of rectangle: 5
 Enter width of rectangle: 3
 Area of rectangle is: 15.0
 *****************************************************/