/*1.	Write a Java program to find the sum of elements in an array using a for-each loop.*/
package Test17;

import java.util.Scanner;

public class Q1_SumOfElmtInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.print("Enter your array element: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum =0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        System.out.print("Sum of the elements is: "+sum);
    }
}
/***************************OUTPUT******************************
 Enter your array size: 5
 Enter your array element: 1 2 3 4 5
 Sum of the elements is: 15
****************************************************************/