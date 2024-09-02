/*Write a program to demonstrate the use of interfaces and abstract classes in Java.*/
package Assignment32;

interface Shape{
    double getArea();
}

abstract class Animals{
    abstract void makeSound();

    void eat(){
        System.out.println("Eating..");
    }
}

class Dogs extends Animals {
    @Override
    void makeSound() {
        System.out.println("bhouuuu...bhouuu..!");
    }
}

class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return  3.14*radius*radius;
    }
}

public class WAPToDemonstrateInterfaceAndAbstraction {
    public static void main(String[] args) {
        Dogs ob = new Dogs();
        ob.makeSound();
        ob.eat();

        Circle ob1 = new Circle(4);
        System.out.println("Area of Circle: "+ob1.getArea());
    }
}
/************************OUTPUT****************************
 bhouuuu...bhouuu..!
 Eating..
 Area of Circle: 50.24
 ***********************************************************/