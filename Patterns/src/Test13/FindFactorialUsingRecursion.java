/*Q3.Implement a recursive function to calculate the factorial of a non-negative integer.*/
package Test13;

import java.util.Scanner;

public class FindFactorialUsingRecursion {

    public static int factorial(int a){
        if(a==1) return a;

        return a*factorial(a-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n= sc.nextInt();
        System.out.print("Factorial: "+factorial(n));
    }
}
/************************OUTPUT*************************
 Enter Number: 5
 Factorial: 120
 ********************************************************/