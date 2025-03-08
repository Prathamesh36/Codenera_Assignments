/*Q3..Write a Java program to replace each element of the array with product of every other element in a given array of integers.

Example:
Input :
nums1 = { 1, 2, 3, 4, 5, 6, 7}
Output:
Array with product of every other element:
[5040, 2520, 1680, 1260, 1008, 840, 720]*/
package Test0;

import java.util.Scanner;

public class ReplaceArrayWithProduct {

    public int[] replace(int a[]){
        int total_prod=1;
        for (int i = 0; i <a.length; i++) {
            total_prod=total_prod*a[i];
        }
        int prod =1;
        for (int i = 0; i < a.length; i++) {
            prod=total_prod/a[i];
            a[i]=prod;
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
        System.out.print("Array after replacing with products is: ");
        ReplaceArrayWithProduct ob = new ReplaceArrayWithProduct();
        int g[]=ob.replace(a);
        for(int i=0;i<g.length;i++){
            System.out.print(g[i]+" ");

        }
    }
}
/************************OUTPUT***************************
 Enter Array size: 7
 Enter Array element: 1 2 3 4 5 6 7
 Array after replacing with products is: 5040 2520 1680 1260 1008 840 720
 **********************************************************/
