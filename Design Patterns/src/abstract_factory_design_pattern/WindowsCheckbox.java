package abstract_factory_design_pattern;

// Concrete Product - WindowsCheckbox
public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering Windows Checkbox.");
    }
}