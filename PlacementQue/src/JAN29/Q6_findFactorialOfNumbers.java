/*6) Create a program that calculates the factorial of a given number. If the factorial is even,
 find the sum of its digits. If it's odd, find the product of its digits.
*/
package JAN29;

import java.util.Scanner;

public class Q6_findFactorialOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int fact =1;
        for (int i = n; i >0 ; i--) {
            fact*=i;
        }
        System.out.println("Factorial: "+fact);
        if(fact%2==0){
            int sum=0;
            for (int i = fact; i!=0 ; i=i/10) {
                int rem = i%10;
                sum += rem;
            }
            System.out.println("Factorial is even | sum of digits: "+sum);
        }
        else {
            int pro=1;
            for (int i = fact; i!=0 ; i=i/10) {
                int rem = i%10;
                pro *= rem;
            }
            System.out.println("Factorial is odd | product of digits: "+pro);
        }
    }
}
