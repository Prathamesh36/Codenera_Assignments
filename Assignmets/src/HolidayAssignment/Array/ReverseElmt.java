/*41.	Write a program to reverse the elements in an array.*/
package HolidayAssignment.Array;

import java.util.Scanner;

public class ReverseElmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Reverse Array: ");
        for (int i = a.length-1; i >=0 ; i--) {
            System.out.print(a[i]+" ");
        }
    }
}
/************************OUTPUT****************************
 Enter Array size: 5
 Enter Array element: 1 2 3 4 5
 Reverse Array: 5 4 3 2 1
 *********************************************************/