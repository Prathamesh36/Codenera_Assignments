package factory_design_pattern;

public class Main {
    public static void main(String[] args) {
        // Request different vehicle types through the factory
        Vehicle car = VehicleFactory.getVehicle("car");
        car.design();
        car.manufacture();

        Vehicle bike = VehicleFactory.getVehicle("bike");
        bike.design();
        bike.manufacture();

        Vehicle truck = VehicleFactory.getVehicle("truck");
        truck.design();
        truck.manufacture();
    }
}

/*
Designing Car...
Manufacturing Car...
Designing Bike...
Manufacturing Bike...
Designing Truck...
Manufacturing Truck...
*/