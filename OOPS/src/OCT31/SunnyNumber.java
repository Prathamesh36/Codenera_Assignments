/*Q2.Write a java program to check inputed number is sunny number or not Sunny .
 A number is called a sunny number if the number next to the given number is a
 perfect square. In other words, a number N will be a sunny number if N+1 is a
 perfect square.
*/
package OCT31;

import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int k= sc.nextInt();
        int c=0;
        for(int i=1;i<k/2;i++){
            if(i*i == k+1){
               c++;
               break;
            }
        }
        if(c==1){
            System.out.print("Given number is sunny number");
        }
        else{
            System.out.print("Given number is not sunny number");
        }
    }
}
