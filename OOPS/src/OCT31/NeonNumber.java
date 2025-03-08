/*Q3.Wite a java program to input a number and check inputed number is  Neon
Number in Java A positive integer whose sum of digits of its square is equal
to the number itself is called a neon number.
*/
package OCT31;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int k= sc.nextInt();
        int fact=0;
        int sum=0;
        int ans = k*k;
        for (int i = ans; i!=0; i=i/10) {
            int rem=i%10;
            fact+=rem;


        }
        // System.out.println(sum);
        if(fact==k) {
            System.out.print("Given number is neon number ");
        }
        else {
            System.out.print("Given number is not neon number");
        }
    }
}
