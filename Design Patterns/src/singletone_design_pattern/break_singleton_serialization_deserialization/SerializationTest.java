package singletone_design_pattern.break_singleton_serialization_deserialization;

import java.io.*;

class Singleton implements Serializable {
    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
    /*******solution***********/
    // Add this method to the Singleton class
    protected Object readResolve() {
        return getInstance(); // Return the existing instance
    }

}

public class SerializationTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();

        try {
            // Serialize the instance
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
            oos.writeObject(singleton1);
            oos.close();

            // Deserialize to create a new instance
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.ser"));
            Singleton singleton2 = (Singleton) ois.readObject();
            ois.close();

            // This will print two different instances, breaking Singleton
            System.out.println(singleton1.hashCode());
            System.out.println(singleton2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
