package singletone_design_pattern.break_singleton_reflection;

import java.lang.reflect.Constructor;

class Singleton {
    private static Singleton instance = new Singleton(); // Early instantiation

    private Singleton() {
        // Prevent instance creation using reflection
        if (instance != null) {
            throw new IllegalStateException("Instance already created!");
        }
    }

    public static Singleton getInstance() {
        return instance;
    }
}

public class ReflectionTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();

        Singleton singleton2 = null;
        try {
            // Access the private constructor using reflection
            Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true); // Bypass the private constructor
            singleton2 = constructor.newInstance(); // Create a new instance
        } catch (Exception e) {
            e.printStackTrace();
        }

        // This will print two different instances, breaking Singleton
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
