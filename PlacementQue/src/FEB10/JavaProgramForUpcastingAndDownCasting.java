package FEB10;

class Animal1 {
    public void makeSound(){
        System.out.println();
    }
}

class Dog1 extends Animal1{
    @Override
    public void makeSound() {
        System.out.println("Bhoou!");
    }
}

class Cat1 extends Animal1{
    @Override
    public void makeSound() {
        System.out.println("Meouu!");
    }
}

public class JavaProgramForUpcastingAndDownCasting {
    public static void main(String[] args) {
        Animal1 a = new Dog1();
        Animal1 b = new Cat1();

        a.makeSound();
        b.makeSound();

        Dog1 d = (Dog1)a;
        d.makeSound();
    }
}
