/*56.	Write a program to find the median of two sorted arrays.*/
package HolidayAssignment.Array;

import java.util.Scanner;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.print("Enter your array element: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.print("Enter your array size: ");
        int n1 = sc.nextInt();
        int[] b= new int[n1];
        System.out.print("Enter your array element: ");
        for(int i=0;i<n1;i++){
            b[i]=sc.nextInt();
        }
        int c[] = new int [a.length+b.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for (int i=0;i<b.length;i++){
            c[i+a.length]=b[i];
        }
        int median = c.length/2;
        System.out.print("Median is: "+c[median]);
    }
}
/************************OUTPUT****************************
 Enter your array size: 5
 Enter your array element: 1 2 3 4 5
 Enter your array size: 4
 Enter your array element: 6 7 8 9
 Median is: 5
 *********************************************************/