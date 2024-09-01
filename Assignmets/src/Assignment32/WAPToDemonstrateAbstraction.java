/*Write a program to demonstrate the use of abstract classes in Java.*/
package Assignment32;

abstract class Language{
    public void dis(){
        System.out.print("Hello World!!");
    }
}

public class WAPToDemonstrateAbstraction extends Language {
    public static void main(String[] args) {
        WAPToDemonstrateAbstraction ob = new WAPToDemonstrateAbstraction();
        ob.dis();
    }
}
/************************OUTPUT****************************
 Hello World!!
 ***********************************************************/