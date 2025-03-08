/*Q1.Implement a program to check if an array is sorted in ascending order.*/
package Test9;

import java.util.Scanner;

public class CheckAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[]= new int[s];
        System.out.print("Enter Array element: ");
        for (int i = 0; i < s; i++) {
            a[i]=sc.nextInt();
        }
        int c=0;
        for (int i = 0; i < a.length-1; i++) {
            if(a[i+1]<a[i]){
                c++;
            }
        }
        if(c>0){
            System.out.print("Array is not sorted in Ascending order");
        }
        else{
            System.out.print("Array is sorted in Ascending order");
        }
    }
}
/************************OUTPUT 1*****************************
 Enter Array size: 5
 Enter Array element: 2 7 1 3 4
 Array is not sorted in Ascending order
 ************************************************************/
/************************OUTPUT 2*****************************
 Enter Array size: 5
 Enter Array element: 1 2 3 4 5
 Array is sorted in Ascending order
 ************************************************************/