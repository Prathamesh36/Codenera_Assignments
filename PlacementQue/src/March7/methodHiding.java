package March7;

class A{
    public  static  void X(){
        System.out.println("Statement 1");
    }
}

class B extends A{
    public  static  void X(){
        System.out.println("Statement 2");
    }
}

public class methodHiding {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        A.X();
        B.X();
    }
}
