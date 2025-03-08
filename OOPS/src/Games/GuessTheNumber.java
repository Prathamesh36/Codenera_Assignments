package Games;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        int j=rn.nextInt(100);
        boolean game = true;
        int attempts =0;
        System.out.println("****** Guess the number between 0 to 100 *******");
        while(true){
            System.out.print("Enter your number: ");
            int num = sc.nextInt();
            if(num>100 || num<0){
                System.out.println("Please Enter number between 0 to 100 ");
            }
            else if(num < j ){
                System.out.println("You guessed too lower, Enter bigger number");
                attempts++;
            }
            else if(num > j){
                System.out.println("You guessed too higher, Enter smaller number");
                attempts++;
            }
            else if(num == j){
                attempts++;
                System.out.println("*************************************************");
                System.out.println("Hurray!! You guessed it right in " + attempts + " attempts");
                System.out.println("*************************************************");
                break;
            }
        }
    }
}
