package JAN24;

import java.util.Scanner;

public class PrintFibonacciSeriesUsingRecursion {

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
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i)+" ");
        }

    }
}
