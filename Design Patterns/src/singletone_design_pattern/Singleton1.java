package singletone_design_pattern;

public class Singleton1 {
    //Eager way of creating singleton object
    private static Singleton1 instance1 = new Singleton1();

    public static Singleton1 getInstance1(){
        return instance1;
    }
}
