/*Write a program to demonstrate the use of abstract classes in Java.*/
package Assignment21;

import java.util.Scanner;

abstract class Shapes{
    abstract int calculateArea();
}
class Rectangle extends Shapes{
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


public class ShowAbstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of rectangle: ");
        int h = sc.nextInt();
        System.out.print("Enter width of rectangle: ");
        int w = sc.nextInt();
        Shapes ob= new Rectangle(h,w);
        System.out.print("Area of rectangle is: "+ob.calculateArea());
    }
}
/********************************************************
 Enter height of rectangle: 5
 Enter width of rectangle: 4
 Area of rectangle is: 20
 ********************************************************/