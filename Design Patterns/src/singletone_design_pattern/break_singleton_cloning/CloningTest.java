package singletone_design_pattern.break_singleton_cloning;

class Singleton implements Cloneable {
    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone(); // This creates a new instance, breaking Singleton
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        throw new CloneNotSupportedException("Singleton class can't be cloned!");  //or
        return instance;
    }
}

public class CloningTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();

        Singleton singleton2 = null;
        try {
            singleton2 = (Singleton) singleton1.clone(); // Cloning the singleton
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // This will print two different instances, breaking Singleton
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
