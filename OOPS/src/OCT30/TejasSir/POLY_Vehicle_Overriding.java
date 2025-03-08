/*2. Write a Java program to create a class Vehicle with a method called speedUp(). Create two subclasses Car and
Bicycle. Override the speedUp() method in each subclass to increase the vehicle's speed differently.
*/
package OCT30.TejasSir;


class Vehicle{

    public void speedUp(){
        System.out.println("speed is 0km/hr");
    }
}
class Car extends Vehicle{
    public void speedUp(){
        System.out.println("speed is 50km/hr");
    }
}
class Bicycle extends Vehicle{
    public void speedUp(){
        System.out.println("speed is 10km/hr");
    }
}
public class POLY_Vehicle_Overriding {
    public static void main(String[] args) {
        Vehicle ob = new Car();
        Vehicle ob1 = new Bicycle();
        ob.speedUp();
        ob1.speedUp();
    }
}
