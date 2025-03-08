package OCT25.TejasSir;

import java.util.Scanner;

class Circle{
    int radius;
    Circle(int radius){
        this.radius=radius;
    }
    public void area(){

        double area = 3.14*radius*radius;
        System.out.print("\nArea of circle is: "+area);
    }
    public void perimeter(){

        double peri = 2*3.14*radius;
        System.out.print("Perimeter of circle is: "+peri);
    }
}

public class AreaAndCircumOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of cicle: ");
        int radius = sc.nextInt();
        Circle ob = new Circle(radius);
        ob.perimeter();
        ob.area();
    }
}
