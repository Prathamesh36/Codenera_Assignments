package singletone_design_pattern;

public class Example {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton.hashCode());   //2065951873
        System.out.println(singleton1.hashCode());  //2065951873
        //both print statement will give same hashcode value

        //Eager Way object will also give same hashcode value

    }
}

