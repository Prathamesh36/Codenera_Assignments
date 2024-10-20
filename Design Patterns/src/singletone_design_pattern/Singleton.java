package singletone_design_pattern;


public class Singleton {
    // Static variable to hold the single instance of the class
    // The below field is static because we are accessing it in static field
    //The instance variable is marked as private to restrict direct access to it from outside the Singleton class.
    private static Singleton instance;  // This is a lazy way of creating a singleton object

    // Private constructor to prevent instantiation from outside
    private Singleton() {
    }

    // Public method to provide the global point of access to the instance
    // getInstance() method is marked as static because it allows the method to be called without creating an instance of the class.
    public static Singleton getInstance() {
        if (instance == null) {
            // Create a new instance if it doesn't exist
            synchronized (Singleton.class){
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}