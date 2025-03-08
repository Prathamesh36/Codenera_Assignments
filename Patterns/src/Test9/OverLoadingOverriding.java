/*Q5.Write a Java program to demonstrate method overloading and method overriding.*/
package Test9;

class ABC{
    public void showA(){
        System.out.println("Parent Class Method A");
    }
}

public class OverLoadingOverriding extends ABC{
    public void showA(){
        System.out.println("Child Class Method A");
    }
    public void showB(int a){
        System.out.println("Method B with Arguments");
    }
    public void showB(){
        System.out.println("Method B without Arguments");
    }
    public static void main(String[] args) {
        ABC ob = new OverLoadingOverriding();
        ob.showA();                         // performing overriding
        OverLoadingOverriding ob1 = new OverLoadingOverriding();
        ob1.showB(5);                   // performing overloading
    }
}
