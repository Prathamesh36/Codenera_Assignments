/*Q4.Define an interface "Shape" with methods for calculating area and perimeter. Create classes like
"Circle" and "Rectangle" that implement this interface.
*/
package Test9;

import java.util.Scanner;

interface Shape{
    double getArea();
    double peri();
}
class Rectangle implements Shape{
    int h;
    int w;
    public double getArea(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of rectangle: ");
        h = sc.nextInt();
        System.out.print("Enter width of rectangle: ");
        w = sc.nextInt();
        double area = h*w;
        return area;
    }
    public double peri(){
        double peri= 2*h*w;
        return peri;
    }
}
class Circle implements Shape{
    int r;
    public double getArea(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        r = sc.nextInt();
        double area = 3.14*r*r;
        return area;
    }
    public double peri(){
        double peri= 2*3.14*r;
        return peri;
    }
}
public class CalculateAreaUsingInterface {
    public static void main(String[] args) {
        Shape ob = new Rectangle();
        System.out.println("Area of rectangle is: "+ob.getArea());
        System.out.println("Perimeter of rectangle is: "+ob.peri());
        Shape ob1 = new Circle();
        System.out.println("Area of Circle is: "+ob1.getArea());
        System.out.println("Perimeter of Circle is: "+ob1.peri());
    }
}
/************************OUTPUT 1*****************************
 Enter height of rectangle: 5
 Enter width of rectangle: 4
 Area of rectangle is: 20.0
 Perimeter of rectangle is: 40.0
 Enter radius of circle: 4
 Area of Circle is: 50.24
 Perimeter of Circle is: 25.12
 ************************************************************/