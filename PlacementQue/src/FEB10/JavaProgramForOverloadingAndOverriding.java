package FEB10;

class Animal{
    void makeSound(){
        System.out.println("Animal");
    }
}

class Dog extends Animal{
    //Method overriding
    @Override
    void makeSound(){
        System.out.println("Bhoou! Bhoou! Bhoou!");;
    }
    //Method overloading
    void makeSound(int count){
        System.out.println("Bhoou...");;
    }
}
class Cat extends Animal{
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

public class JavaProgramForOverloadingAndOverriding {

    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();

        a.makeSound();
        d.makeSound();
        c.makeSound();

        d.makeSound(1);
    }
}
