/*Write a program to merge two sorted arrays into a single sorted array.*/
package PlacementQue.ArrayQues;

import java.util.Scanner;

public class Q10_MergeTwoArray {
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
        System.out.print("Merged Array: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ");
        }
    }
}
/************************OUTPUT****************************
 Enter your array size: 5
 Enter your array element: 1 2 3 4 5
 Enter your array size: 5
 Enter your array element: 6 7 8 9 10
 Merged Array: 1 2 3 4 5 6 7 8 9 10
 *********************************************************/
