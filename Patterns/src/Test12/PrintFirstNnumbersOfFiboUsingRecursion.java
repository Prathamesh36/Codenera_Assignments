/*Q.14. Implement a Java function to print the first n numbers of the Fibonacci series using recursion.*/
package Test12;

import java.util.Scanner;

public class PrintFirstNnumbersOfFiboUsingRecursion {
    static int fibo(int a){
        if(a==0){
            return a;
        }
        if(a==1){
            return a;
        }
        return fibo(a-1)+fibo(a-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i)+" ");
        }

    }
}
/*************************OUTPUT****************************
 Enter your number: 8
 Fibonacci Series:
 0 1 1 2 3 5 8 13
 ************************************************************/