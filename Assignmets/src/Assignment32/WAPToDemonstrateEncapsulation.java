/*1.Write a program to show encapsulation in Java.*/
package Assignment32;

class Area{
    int length;
    int breadth;

    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void getArea(){
        int area = length* breadth;
        System.out.println("Area of rectangle: "+area);
    }
}

public class WAPToDemonstrateEncapsulation {
    public static void main(String[] args) {
        Area ob = new Area(5,2);
        ob.getArea();
    }
}
/************************OUTPUT****************************
 Area of rectangle: 10
 ***********************************************************/