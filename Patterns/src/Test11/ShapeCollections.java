package Test11;

import java.util.ArrayList;
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
    public ShapeCollection( Object a){
        this.a= (Shape[]) a;
    }
    public int totalArea(){
        int totalArea= 0;
        for(int i=0;i<a.length;i++){
            totalArea+=a[i].calculateArea();
        }
        return totalArea;
    }
}

public class ShapeCollections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        System.out.print("Enter height of rectangle: ");
        int h = sc.nextInt();
        System.out.print("Enter width of rectangle: ");
        int w = sc.nextInt();
        shapes.add(new Rectangle(h,w));
        System.out.print("Enter height of triangle: ");
        int h1= sc.nextInt();
        System.out.print("Enter base of triangle: ");
        int b = sc.nextInt();
        shapes.add(new Triangle(h1,b));
        ShapeCollection collection = new ShapeCollection(shapes);
        int totalArea = collection.totalArea();
        System.out.println("Total Area: "+totalArea);

    }
}
/***********************OUTPUT************************
 Enter height of rectangle: 5
 Enter width of rectangle: 4
 Enter height of triangle: 6
 Enter base of triangle: 3
 Total Area: 29
 ****************************************************/