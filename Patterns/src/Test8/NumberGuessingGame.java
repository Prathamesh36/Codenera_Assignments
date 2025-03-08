/*13.
Number Guessing Game:
Create a game where the computer selects a random number, and the player has to guess it. Use loops to allow the player
to make multiple guesses until they find the correct number. Use control statements to provide hints (higher or lower)
and end the game when the correct number is guessed.*/
package Test8;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int random=rn.nextInt(100);
        int attempts =0;
        System.out.println("------- Guess the number between 0 to 100 -------");
        while(true){
            System.out.print("Enter your number: ");
            int num = sc.nextInt();
            if(num>100 || num<0){
                System.out.println("Please Enter number between 0 to 100 ");
            }
            else if(num < random ){
                System.out.println("You guessed too lower, Enter bigger number");
                attempts++;
            }
            else if(num > random){
                System.out.println("You guessed too higher, Enter smaller number");
                attempts++;
            }
            else if(num == random){
                attempts++;
                System.out.println("*************************************************");
                System.out.println("Hurray!! You guessed it right in " + attempts + " attempts");
                System.out.println("*************************************************");
                break;
            }
        }
    }
}
/***********************OUTPUT*************************

 ------- Guess the number between 0 to 100 -------
 Enter your number: 25
 You guessed too lower, Enter bigger number
 Enter your number: 50
 You guessed too lower, Enter bigger number
 Enter your number: 76
 You guessed too higher, Enter smaller number
 Enter your number: 65
 *************************************************
 Hurray!! You guessed it right in 4 attempts
 *************************************************


 *****************************************************/
