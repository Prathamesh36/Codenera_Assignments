/*1. Write a Java program to create a base class Animal (Animal Family) with a method called Sound().
Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific
sound for each animal.
*/
package OCT30.TejasSir;

class Animal{

    public void sound(){
        System.out.println("this is sound of animal");
    }
}
class Bird extends Animal{
    public void sound(){
        System.out.println("Bird is charm");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("Cat sound is mauu");
    }
}

public class POLY_Animal_Overriding {
    public static void main(String[] args) {
        Animal ob = new Bird();
        Animal ob1 =new Cat();
        ob.sound();
        ob1.sound();
    }
}
