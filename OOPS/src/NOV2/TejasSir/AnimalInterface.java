/*2. Write a Java program to create a Animal interface with a method called bark() that takes no arguments
and returns void. Create a Dog class that implements Animal and overrides speak() to print "Dog is barking".
*/
package NOV2.TejasSir;

interface Animal{
    public void bark();
}

class dog implements Animal{
    public void bark(){
        System.out.print("Dog is barking");
    }
}
public class AnimalInterface {
    public static void main(String[] args) {
        Animal ob = new dog();
        ob.bark();
    }
}
