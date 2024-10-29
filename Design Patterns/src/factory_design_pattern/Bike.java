package factory_design_pattern;

public class Bike implements Vehicle {
    @Override
    public void design() {
        System.out.println("Designing Bike...");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing Bike...");
    }
}
