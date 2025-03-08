/*8.Write a Java program to find the factorial of a given number */
package Test8;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int mul = 1;
        for(int i=n;i>=1;i--){
            mul=mul*i;
        }
        System.out.print("Factorial of given number is: "+mul);
    }
}
/***********************OUTPUT*************************
 Enter your number: 5
 Factorial of given number is: 120
 *****************************************************/