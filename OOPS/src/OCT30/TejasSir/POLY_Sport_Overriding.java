/*5. Write a Java program to create a base class Sports with a method called play().
Create three subclasses: Football, Basketball, and Rugby. Override the play() method in
each subclass to play a specific statement for each sport.*/
package OCT30.TejasSir;

class Sports{
    public void play(){
        System.out.println("Sports");
    }
}
class Football extends Sports{
    public void play(){
        System.out.println("Playing Football");
    }
}
class Basketball extends Sports{
    public void play(){
        System.out.println("Playing Basketball");
    }
}
class Rugby extends Sports{
    public void play(){
        System.out.println("Playing Rugby");
    }
}
public class POLY_Sport_Overriding {
    public static void main(String[] args) {
        Sports ob = new Football();
        Sports ob1 = new Basketball();
        Sports ob2 = new Rugby();
        ob.play();
        ob1.play();
        ob2.play();
    }
}
