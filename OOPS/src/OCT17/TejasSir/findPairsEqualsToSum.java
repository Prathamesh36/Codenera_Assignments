/*Q4.Given an array of N integers, and a number sum, the task is to find the number of pairs of integers
   in the array whose sum is equal to sum.

Examples:

Input:  arr[] = {1, 5, 7, -1}, sum=6
Output:2*/
package OCT17.TejasSir;

import java.util.Scanner;

public class findPairsEqualsToSum {

    public void pairs(int[] a,int s){
        int c=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==s){
                    c++;
                }
            }
        }
        System.out.print("Total number of pairs whose sum equal to "+s+" is: "+c);
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
        System.out.print("Enter number :");
        int s = sc.nextInt();
        findPairsEqualsToSum ob = new findPairsEqualsToSum();
        ob.pairs(a,s);
    }
}
