/*
Sum of First N Natural Numbers
Write a program to calculate the sum of the first N natural numbers.

Example:
Input: N = 10
Output: 55
 */
package Jan10;

public class SumofNnos {
    public static void main(String[] args) {
        int n = 6;
        int a = 0;
        int b = 1;
        System.out.print(a+" ");//0
        System.out.print(b+" ");//1
        for(int i =2 ;i < n ;i++){
            int c = a+b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }
    }
}

// 0 1 1 2 3 5