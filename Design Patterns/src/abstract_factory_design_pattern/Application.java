package abstract_factory_design_pattern;

// Client Code
public class Application {
    private Button button;
    private Checkbox checkbox;

    // Constructor initializes the application with a GUIFactory
    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    // Method to paint the UI components
    public void paint() {
        button.paint();
        checkbox.paint();
    }
}

