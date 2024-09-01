/*Write a program to demonstrate the use of interfaces in Java.*/
package Assignment32;

interface Polygon{
    void getArea(int length, int breadth);
}

class Rectangle implements Polygon{
    @Override
    public void getArea(int length, int breadth) {
        System.out.print("The area of rectangle is: "+(length*breadth));
    }
}

public class WAPToDemonstateInterface {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle();
        rc.getArea(5,2);
    }
}
/************************OUTPUT****************************
 The area of rectangle is: 10
***********************************************************/
