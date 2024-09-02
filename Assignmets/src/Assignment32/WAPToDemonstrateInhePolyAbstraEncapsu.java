/*Write a program to demonstrate the use of inheritance, polymorphism, encapsulation, and abstraction in Java.*/
package Assignment32;

abstract class Animal1 {
    private String name;

    public Animal1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void eat();
}

class Dog1 extends Animal1 {
    public Dog1(String name) {
        super(name);
    }
    public void eat() {
        System.out.println("Dog is eating...");
    }
}

class Cat extends Animal1 {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void eat() {
        System.out.println("Cat is eating...");
    }
}

public class WAPToDemonstrateInhePolyAbstraEncapsu {
    public static void main(String[] args) {
        Dog1 dog = new Dog1("Rocky");
        dog.eat();
        Cat cat = new Cat("Kitty");
        cat.eat();
    }
}
/************************OUTPUT****************************
 Dog is eating...
 Cat is eating...
 ***********************************************************/