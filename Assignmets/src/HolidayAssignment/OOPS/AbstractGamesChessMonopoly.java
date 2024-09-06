/*5.	Create a class called "Game" with an abstract method play(). Implement subclasses "Chess" and "Monopoly"
that override the play() method. Create a third subclass "GameCollection" that contains an ArrayList
of Game objects and implement a method to play all the games in the collection.*/
package HolidayAssignment.OOPS;

import java.util.Scanner;

abstract class Game{
    abstract String play();
}
class Chess extends Game{
    public String play(){
        return "Playing chess";
    }
}
class Monopoly extends Game{
    public String play(){
        return "Playing Monopoly";
    }
}
class GameCollection{
    public void game(Game[] gm){
        for (int i=0;i<gm.length;i++){
            System.out.println(gm[i]+" ");
        }
    }
}
public class AbstractGamesChessMonopoly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game [] gm = new Game[2];
        gm[0]= new Chess();
        gm[1]= new Monopoly();
        GameCollection collection = new GameCollection();
        collection.game(gm);

    }
}
/**********************OUTPUT************************
 ***************************************************/
