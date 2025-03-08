/*
Q7.Given an array arr[] of integers, segregate even and odd numbers in the array. Such that all the even numbers should be present first, and then the odd numbers.

Examples:

Input: arr[] = 1 9 5 3 2 6 7 11
Output: 2 6 5 3 1 9 7 11*/
package OCT17.TejasSir;

import java.util.Scanner;

public class evenOddSeperation {

    public void evenOdd(int[] a){
        for (int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++) {
                if (a[i] % 2 == 1) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Array after even odd separation: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.print("Enter your array element: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        evenOddSeperation ob = new evenOddSeperation();
        ob.evenOdd(a);
    }
}
