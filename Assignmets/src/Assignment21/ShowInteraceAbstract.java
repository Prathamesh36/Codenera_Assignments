/*Write a program to demonstrate the use of interfaces and abstract classes in Java.*/
package Assignment21;

import java.util.Scanner;

abstract class Shapesss{
    abstract int calculateArea();
}
class Rectangles extends Shapesss{
    int length;
    int width;
    public Rectangles(int length,int width){
        this.length=length;
        this.width=width;
    }
    int calculateArea(){
        return length* width;
    }
}
interface Shapess1{
    double Area();
}
class Circless implements Shapess1{
    int  radius;
    Circless(int radius){
        this.radius=radius;
    }
    public double Area(){
        double area = 3.14*radius*radius;
        return area;
    }
}
public class ShowInteraceAbstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length=sc.nextInt();
        System.out.print("Enter width ");
        int width=sc.nextInt();
        Shapesss ob = new Rectangles(length,width);
        System.out.println("Area of rectangle is: "+ob.calculateArea());
        System.out.print("Enter radius of circle: ");
        int radius = sc.nextInt();
        Shapess1 ob1 = new Circless(radius);
        System.out.print("Area of Circle is: "+ob1.Area());

    }
}
/********************************************************
 Enter length: 3
 Enter width 4
 Area of rectangle is: 12
 Enter radius of circle: 6
 Area of Circle is: 113.03999999999999
 ********************************************************/