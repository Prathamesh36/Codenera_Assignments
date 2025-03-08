package abstract_factory_design_pattern;

// Concrete Product - MacButton
public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering Mac Button.");
    }
}