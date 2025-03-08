package abstract_factory_design_pattern;

// Concrete Product - MacCheckbox
public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering Mac Checkbox.");
    }
}
