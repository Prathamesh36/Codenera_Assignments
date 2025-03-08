/*Create a class Rectangle with attributes length and width and methods to calculate the perimeter and area of the rectangle.
*/
package OCT25.TejasSir;

import java.util.Scanner;

class parent{
    int length;
    int width;
    parent(int length,int width){
        this.length=length;
        this.width=width;
    }
    public void peri() {
        double peri = 2*(length+width);
        System.out.print("Perimeter of circle is: "+peri);
    }
}

public class PerimeterUsingSingleLvLInheritance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter Width: ");
        int width = sc.nextInt();

        parent ob = new parent(length,width);
        ob.peri();
    }
}
