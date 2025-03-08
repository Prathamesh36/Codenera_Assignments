/*4.Implement a Java class representing a "Vehicle" with attributes like make, model, and year. Create a child class
"Car" that inherits from "Vehicle" and adds additional attributes specific to a car.*/
package Test8;

class Vehicle{
    String make="Tata";
    String model="Nexon";
    int year=2022;

}

public class Car extends Vehicle{
    String fuelType="Diesel";
    int noOfDoors=4;
    String carColor="White";
    public static void main(String[] args) {
        Car ob = new Car();
        System.out.println("Car Maker: "+ob.make);
        System.out.println("Car Model: "+ob.model);
        System.out.println("Fuel Type: "+ob.fuelType);
        System.out.println("No. of Doors: "+ob.noOfDoors);
        System.out.println("Manufacturing year: "+ob.year);
        System.out.println("Car Color: "+ob.carColor);

    }
}
/***********************OUTPUT*************************
 Car Maker: Tata
 Car Model: Nexon
 Fuel Type: Diesel
 No. of Doors: 4
 Manufacturing year: 2022
 Car Color: White
 *****************************************************/
