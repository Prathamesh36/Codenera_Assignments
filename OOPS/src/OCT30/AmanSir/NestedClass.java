package OCT30.AmanSir;

public class NestedClass {

    public void disp(){
        System.out.println("Hello outer class");
    }
        class inner{
            public void disp(){
                System.out.println("Hello inner class");
            }
        }
    public static void main(String[] args) {
        NestedClass ob = new NestedClass();
        ob.disp();
        NestedClass.inner ob1 = ob.new inner();
        ob1.disp();
    }
}
