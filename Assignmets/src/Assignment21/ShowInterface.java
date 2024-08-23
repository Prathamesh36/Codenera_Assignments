/*Write a program to demonstrate the use of interfaces in Java.*/
package Assignment21;

import java.util.Scanner;

interface Shape{
    double getArea();
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
public class ShowInterface {
    public static void main(String[] args) {
        Shape ob1 = new Circle();
        System.out.println("Area of Circle is: "+ob1.getArea());
    }
}
/********************************************************
 Enter radius of circle: 4
 Area of Circle is: 50.24
 ********************************************************/