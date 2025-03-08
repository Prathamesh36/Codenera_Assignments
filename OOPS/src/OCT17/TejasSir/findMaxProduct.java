/*Write a Java program to find maximum product of two integers in a given array of integers.

 Example:
 Input :
 nums = { 2, 3, 5, 7, -7, 5, 8, -5 }
 Output:
 Pair is (7, 8), MaximumProduct:56*/
package OCT17.TejasSir;

import java.util.Scanner;

public class findMaxProduct {

    public void product(int[] a){
        int max =0;
        int smax=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                smax=max;
                max=a[i];
            }
            else if(a[i]>smax && a[i]<max){
                smax=a[i];
            }

        }
        System.out.println("Pairs is: ("+smax+","+max+")");
        int maxProduct = smax * max;
        System.out.print("Maximum Product: "+ maxProduct);
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

        findMaxProduct ob = new findMaxProduct();
        ob.product(a);
    }
}
