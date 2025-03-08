package abstract_factory_design_pattern;

public class Main {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;

        // For demonstration, we assume the OS is Windows. Change this to test Mac.
        String osName = "Windows";

        if (osName.equalsIgnoreCase("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }

        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}


/*

Rendering Windows Button.
Rendering Windows Checkbox.

 */