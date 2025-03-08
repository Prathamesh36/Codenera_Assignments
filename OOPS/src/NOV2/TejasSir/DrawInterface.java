/*4. Write a Java program to create an interface Drawable with a method draw() that takes no arguments
and returns void. Create three classes Circle, Rectangle, and Triangle that implement the Drawable interface
and override the draw() method
*/
package NOV2.TejasSir;

interface Drawable{
    void draw();
}
class Circle1 implements Drawable{
    public void draw(){
        System.out.println("Draw Circle");
    }
}
class Rectangle1 implements Drawable{
    public void draw(){
        System.out.println("Draw Rectangle");
    }
}
class Triangle1 implements Drawable{
    public void draw(){
        System.out.println("Draw Triangle");
    }
}

public class DrawInterface {
    public static void main(String[] args) {
        Drawable ob = new Circle1();
        ob.draw();
        Drawable ob1 = new Rectangle1();
        ob1.draw();
        Drawable ob2 = new Triangle1();
        ob2.draw();
    }
}
