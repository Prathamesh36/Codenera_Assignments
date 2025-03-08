/*Q7.wap to use all 4 pillers in single program*/
package Test9;

class A{
    int a=10;
    int b=5;
    public void ShowC(){            // this method for overriding
        System.out.println("Method Overriding");
    }
}
class B extends A{
    public void ShowB(){
        System.out.println("Inheritance: "+(a+b));  // Inheritance
    }
}

class C extends A{                  //Polymorphism
    public void ShowC(){
        System.out.println("Polymorphism");
    }
}

abstract class E{
    abstract void ShowE();      // Abstraction
}
class F extends E {
    public void ShowE(){
        System.out.println("Abstraction");
    }
}

class G{                    // Encapsulation
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

public class Implement_4_Pillars {
    class D extends C{
        public void ShowC(){
            System.out.println("Method Overriding");
        }
    }
    public static void main(String[] args) {
        B b = new B(); // Inheritance;
        b.ShowB();
        A a = new C();   //Polymorphism
        a.ShowC();
        E e = new F(); // Abstraction
        e.ShowE();
        G g = new G();  // Encapsulation
        g.setA(5);
        System.out.println("Encapsulation "+g.getA());

    }
}
/************************OUTPUT 2*****************************
 Inheritance: 15
 Polymorphism
 Abstraction
 Encapsulation 5
 ************************************************************/