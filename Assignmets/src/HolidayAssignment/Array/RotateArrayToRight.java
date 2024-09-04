/*49.	Write a program to rotate the elements in an array to the right by a given number of positions.*/
package HolidayAssignment.Array;

import java.util.Scanner;

public class RotateArrayToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.print("Enter your array element: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter number of rotations: ");
        int k = sc.nextInt();

        for (int j=0;j<k;j++) {
            int temp = a[a.length - 1];
            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = temp;
        }
        System.out.print("Array after right rotations: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
/************************OUTPUT****************************
 Enter your array size: 7
 Enter your array element: 1 2 3 4 5 6 7
 Enter number of rotations: 3
 Array after right rotations: 5 6 7 1 2 3 4
 *********************************************************/