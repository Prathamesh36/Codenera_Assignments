/*Write a program to demonstrate the use of encapsulation, inheritance, and polymorphism in Java.*/
package Assignment32;

class Encapsulation {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Animal2 {
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}
class Dog2 extends Animal2 {
    public void bark() {
        System.out.println("Dog is barking");
    }
}
class Shape2 {
    public void draw() {
        System.out.println("Shape is being drawn");
    }
}

class Circle2 extends Shape2 {
    @Override
    public void draw() {
        System.out.println("Circle is being drawn");
    }
}

class Rectangle2 extends Shape2 {
    @Override
    public void draw() {
        System.out.println("Rectangle is being drawn");
    }
}
public class WAPToDemonstrateEncapInheriPolymor {
    public static void main(String[] args) {
        Encapsulation ob = new Encapsulation();
        ob.setAge(20);

        System.out.println(ob.getAge());
        Dog2 ob1 = new Dog2();
        ob1.eat();
        ob1.sleep();
        ob1.bark();
        Shape2 ob3 = new Circle2();
        ob3.draw();
        Shape2 ob4 = new Rectangle2();
        ob4.draw();
    }
}
/************************OUTPUT****************************
 20
 Animal is eating
 Animal is sleeping
 Dog is barking
 Circle is being drawn
 Rectangle is being drawn
 ***********************************************************/