/*Write a program to demonstrate the use of inheritance and polymorphism in Java.*/
package Assignment21;

import java.util.Scanner;

class shapess{
    public void calculateArea(){
        System.out.println("Area of shapes");
    }
    int height=10;
}
class Circles extends shapess{
    public void calculateArea(){        //Polymorphism
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rectangle width: ");
        int w = sc.nextInt();
        System.out.println("Area of Rectangle is: "+(double)w*height);      //Inheritance
    }
}
public class ShowPolymorphism {
    public static void main(String[] args) {
        shapess ob = new Circles();
        ob.calculateArea();

    }
}
/********************************************************
 Enter rectangle width: 8
 Area of Rectangle is: 80.0
 ********************************************************/
