/*Write a program to demonstrate the use of encapsulation, inheritance, and polymorphism in Java.*/
package Assignment21;

import java.util.Scanner;

class Sh{
    public void calculateArea(){
        System.out.println("Area of shapes");
    }
    int height=10;
    private int radius=4; // Encapsulation

    public int getRadius() {
        return radius;
    }

}
class Crcl extends Sh{
    public void calculateArea(){        //Polymorphism
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rectangle width: ");
        int w = sc.nextInt();
        System.out.println("Area of Rectangle is: "+(double)w*height);      //Inheritance
    }
}

public class ShowEncapsulationInheritancePolymorphism extends Sh{
    public static void main(String[] args) {
        Sh ob = new Crcl();
        ob.calculateArea();
        Sh ob1 = new ShowEncapsulationInheritancePolymorphism();
        System.out.print("Area of Cicle is: "+ob1.getRadius()*ob1.getRadius());

    }
}
