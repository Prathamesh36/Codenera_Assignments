package Games;

import java.util.Random;
import java.util.Scanner;

public class GusseTheNumber2player {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
       System.out.print("Player 1 Enter your number: ");
        int j=sc.nextInt();
        int h=1;
        while(h<60){
            System.out.println();
            h++;
        }
        System.out.println();
       System.out.println("Number Entered Successfully!!");
       System.out.println("--Guess the number in minimum attempts--");

        int attempts =0;
        System.out.println("****** Guess the number between 0 to 100 *******");
        while(true){
            System.out.print("Enter your number: ");
            int num = sc.nextInt();
            if(num>100 || num<0){
                System.out.println("Please Enter number between 0 to 100 ");
            }
            else if(num < j ){
                System.out.println("You guessed to lower, Enter bigger number");
                attempts++;
            }
            else if(num > j){
                System.out.println("You guessed to higher, Enter smaller number");
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
