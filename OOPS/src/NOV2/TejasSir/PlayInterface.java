/*6. Write a Java program to create an interface Playable with a method play() that takes no arguments
 and returns void. Create three classes Football, Volleyball, and Basketball that implement the
 Playable interface and override the play() method to play the respective sports.*/
package NOV2.TejasSir;

interface Playable{
    void play();
}
class Football implements Playable{
    public void play(){
        System.out.println("Playing Football");
    }
}
class Volleyball implements Playable{
    public void play(){
        System.out.println("Playing Volleyball");
    }
}
class Basketball implements Playable{
    public void play() {
        System.out.println("Playing Basketball");
    }
}

public class PlayInterface {
    public static void main(String[] args) {
        Playable ob = new  Football();
        ob.play();
        Playable ob1 = new  Volleyball();
        ob1.play();
        Playable ob2 = new  Basketball();
        ob2.play();
    }
}
