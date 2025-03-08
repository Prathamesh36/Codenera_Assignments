/*3. Write a Java program to create an interface Flyable with a method called fly_obj().
Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface.
Implement the fly_obj() method for each of the three classes.*/

package NOV2.TejasSir;

interface Flyable{
    void fly_obj();
}
class SpaceCraft implements Flyable{
    public void fly_obj(){
        System.out.println("Spacecraft is Flyable");
    }
}
class Airplane implements Flyable{
    public void fly_obj(){
        System.out.println("Airplane is Flyable");
    }
}
class Helicopter implements Flyable{
    public void fly_obj(){
        System.out.println("Helicopter is Flyable");
    }
}


public class FlyableInterface {
    public static void main(String[] args) {
        Flyable ob = new SpaceCraft();
        ob.fly_obj();
        Flyable ob1 = new Airplane();
        ob1.fly_obj();
        Flyable ob2 = new Helicopter();
        ob2.fly_obj();

    }
}
