package Jun25;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        boolean playAgain = false;
        do{
            int random = rd.nextInt(100);
            int numberOfAttempts=10;
            boolean isGuessed = false;
            System.out.println("----Guess the number between 1 to 100 ------");
            for (int i = 1; i <= numberOfAttempts; i++) {
                System.out.print("\nAttempt number "+ i +"\nEnter your number : ");
                int num = sc.nextInt();
                if(num > 100 || num <1){
                    System.out.println("Please Enter number between 1 and 100");
                }
                else if(num < random){
                    System.out.println("The guessed number is too low, Enter higher number");

                }
                else if(num > random){
                    System.out.println("The guessed number is too high, Enter lower number");

                }
                else{
                    System.out.println("Congratulations !! You guessed it correct....");
                    isGuessed = true;
                    break;
                }
            }
            if (!isGuessed){
                System.out.println("\nSorry! you have used all your attempts");
            }
            System.out.println("Do you want to play again(yes/no)");
            String res = sc.next();
            playAgain = res.equalsIgnoreCase("yes");

        }while(playAgain);
    }
}
