/*Q2.Write a Java program to rearrange a given array of unique elements such that every second element of the array is greater than its left and right elements.

Example:
Input :
nums= { 1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14 }
Output:
Array with every second element is greater than its left and right elements:
[1, 4, 2, 9, 3, 8, 5, 10, 7, 14, 12]*/
package Test0;

import java.util.Scanner;

public class ReArrangeArray {
    public int[] rearrange(int a[]){
        for(int i=1;i<a.length-1;i=i+2){

            if(a[i]<a[i-1]){
                int temp = a[i];
                a[i]=a[i-1];
                a[i-1]=temp;
            }
            if(a[i]<a[i+1]){
                int temp = a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Rearranged Array is: ");
        ReArrangeArray ob = new ReArrangeArray();
        int g[]=ob.rearrange(a);
        for(int i=0;i<g.length;i++){
            System.out.print(g[i]+" ");

        }

    }
}
/************************OUTPUT***************************
 Enter Array size: 11
 Enter Array element: 1 2 4 9 5 3 8 7 10 12 14
 Rearranged Array is: 1 4 2 9 3 8 5 10 7 14 12
**********************************************************/