/*Write a Java program to create a class called Circle with a private instance variable radius.
Provide public getter and setter methods to access and modify the radius variable. However,
provide two methods called calculateArea() and calculatePerimeter() that return the calculated area
 and perimeter based on the current radius value.*/
package NOV3.TejasSir;

import java.util.Scanner;

class RadiusPeri{
    private int radius;

    RadiusPeri(int radius) {
        setRadius(radius);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void calculateArea(){
        double area=3.14*radius*radius;
        System.out.println("Area of Circle is: "+area);
    }
    public void calculatePerimeter(){
        double per = 3.14*2*radius;
        System.out.println("Perimeter of Circle is: "+per);
    }
}


public class CircleRadiusPerimeter  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        int r = sc.nextInt();
        RadiusPeri ob = new RadiusPeri(r);
        ob.calculateArea();
        ob.calculatePerimeter();
    }
}
