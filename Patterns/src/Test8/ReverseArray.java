/*6.Create a Java program to reverse an array of integers without using any additional data structures.*/
package Test8;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.print("Enter your array element: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int start=0;
        int end=a.length-1;
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        System.out.print("Reverse Array is: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
/***********************OUTPUT*************************
 Enter your array size: 6
 Enter your array element: 1 2 3 4 5 6
 Reverse Array is: 6 5 4 3 2 1
 *****************************************************/