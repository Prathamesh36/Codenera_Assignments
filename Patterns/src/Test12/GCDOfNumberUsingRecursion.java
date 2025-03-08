/*Q1.Write a Java program to find the GCD of two numbers using recursion.*/
package Test12;

import java.util.Scanner;

public class GCDOfNumberUsingRecursion {

    static int FindGCD(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return FindGCD(b,a%b);
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();
        System.out.println("GCD of "+a+" and "+b+" is: "+FindGCD(a,b) );
    }
}
/*************************OUTPUT****************************
 Enter 1st number: 36
 Enter 2nd Number: 48
 GCD of 36 and 48 is: 12
************************************************************/