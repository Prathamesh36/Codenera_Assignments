/*Q10. Program to cyclically rotate an array by one
Input:  arr[] = {1, 2, 3, 4, 5}
Output: arr[] = {5, 1, 2, 3, 4}*/
package Assignment25;

import java.util.Scanner;

public class CyclicallyRotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.print("Enter your array element: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int temp = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = temp;
        System.out.print("Array After rotation: ");
        for(int i=0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

/***************************OUTPUT*******************************
 Enter your array size: 5
 Enter your array element: 1 2 3 4 5
 Array After rotation: 5 1 2 3 4
 ***************************************************************/