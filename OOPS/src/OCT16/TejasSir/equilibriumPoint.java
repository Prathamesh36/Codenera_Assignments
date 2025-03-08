/*
Q3.Given an array A of n positive numbers. The task is to find the first Equilibrium Point in an array.
Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Note: Return the index of Equilibrium point. (1-based index)

Example 1:

Input:
n = 5
A[] = {1,3,5,2,2}
Output: 3
*/
package OCT16.TejasSir;

import java.util.Scanner;

public class equilibriumPoint {

    public void equPt(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array length: ");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter your array element: ");
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        int c=0;


        System.out.print("Equilibrium Point is: ");
        for(int i =0;i<a.length;i++){
            int firstSum=0;
            for(int j=0;j<i;j++){
                firstSum += a[j];
            }
            int lastSum=0;
            for(int j=i+1;j<a.length;j++){
                lastSum+= a[j];
            }
            if(firstSum==lastSum){
                System.out.print(i+1);
            }
        }

    }

    public static void main(String[] args) {
        equilibriumPoint ob = new equilibriumPoint();
        ob.equPt();
    }
}
