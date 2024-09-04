/*42.	Write a program to check if an array is sorted in ascending order.*/
package HolidayAssignment.Array;

import java.util.Scanner;

public class SortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int c=0;
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]>=a[i+1]){
                c++;
            }
        }
        if(c==0){
            System.out.print("Array is Sorted");
        }
        else{
            System.out.print("Array is not Sorted");
        }
    }
}
/************************OUTPUT****************************
 Enter Array size: 5
 Enter Array element: 1 4 5 6 9
 Array is Sorted
 *********************************************************/