package abstract_factory_design_pattern;

// Concrete Product - WindowsButton
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering Windows Button.");
    }
}
