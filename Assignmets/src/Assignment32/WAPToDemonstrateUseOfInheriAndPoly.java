/*Write a program to demonstrate the use of inheritance and polymorphism in Java.*/
package Assignment32;

abstract class Animal{
    public void move(){
        System.out.println("Animal Moving");
    }
}

class Dog extends Animal{
    public void move(){
        System.out.println("Dog is running..");
    }

    public void bark(){
        System.out.println("Dog is barking..");
    }
}

public class WAPToDemonstrateUseOfInheriAndPoly {
    public static void main(String[] args) {
        Dog ob = new Dog();
        ob.move();
        ob.bark();
    }
}
/************************OUTPUT****************************
 Dog is running..
 Dog is barking..
 ***********************************************************/