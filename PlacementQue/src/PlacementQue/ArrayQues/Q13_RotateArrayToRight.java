/*Write a program to rotate the elements in an array to the right by a given number of positions.*/
package PlacementQue.ArrayQues;

import java.util.Scanner;

public class Q13_RotateArrayToRight {
    public static int[] rotation(int a[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rotations: ");
        int k = sc.nextInt();

        for (int j=0;j<k;j++) {
            int temp = a[a.length - 1];
            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = temp;
        }
        return a;
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


        int g[] = rotation(a);
        for(int i=0;i<g.length;i++){
            System.out.print(g[i]+" ");
        }
    }
}
/************************OUTPUT****************************
 Enter your array size: 7
 Enter your array element: 4 8 6 1 9 7 3
 Enter number of rotations: 3
 9 7 3 4 8 6 1
 *********************************************************/
