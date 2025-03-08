package March7;

interface ABC{
    public abstract void method1();
}
interface XYZ{
    public abstract void method2();
}

class class1 implements ABC,XYZ{

    @Override
    public void method1() {
        System.out.println("method 1 implemented");
    }

    @Override
    public void method2() {
        System.out.println("method 2 implemented");
    }
}
public class multipleInheritance {
    public static void main(String[] args) {
        ABC ob1 = new class1();
        XYZ ob2 = new class1();
        ob1.method1();
        ob2.method2();
    }
}
