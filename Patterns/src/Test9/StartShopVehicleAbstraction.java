/*Q6.Create an abstract class "Vehicle" with abstract methods for "start" and "stop." Implement this abstract
class with concrete methods in subclasses like "Car" and "Motorcycle."*/
package Test9;

abstract class vehicle{
    abstract void Strart();
    abstract void Shop();
}
class Car extends vehicle{
    public void Strart(){
        System.out.println("Car Started");
    }
    public void Shop(){
        System.out.println("Car Stopped");
    }
}
class MotorCycle extends vehicle{
    public void Strart(){
        System.out.println("MotorCycle Started");
    }
    public void Shop(){
        System.out.println("MotorCycle Stopped");
    }
}
public class StartShopVehicleAbstraction {
    public static void main(String[] args) {
        vehicle ob = new Car();
        ob.Strart();
        ob.Shop();
        vehicle ob1 = new MotorCycle();
        ob1.Strart();
        ob1.Shop();
    }
}
/************************OUTPUT 1*****************************
 Car Started
 Car Stopped
 MotorCycle Started
 MotorCycle Stopped
 ************************************************************/