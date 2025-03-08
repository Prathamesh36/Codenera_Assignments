/*WAP to print the fabannoci series of n number
*/
package FEB10;

import java.util.Scanner;

public class PrintFibonacciSeries {

    public static int fibo(int a ){
        if(a==0) return 0;
        if(a==1) return 1;
        return fibo(a-1)+fibo(a-2);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n= sc.nextInt();
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i)+" ");
        }
    }
}
