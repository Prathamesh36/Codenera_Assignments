/*53.	Write a program to sort an array of 0s, 1s, and 2s without using any sorting algorithm.*/
package HolidayAssignment.Array;

import java.util.Scanner;

public class SortArray0s1s2s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int zero=0;
        int one=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==0){
                zero++;
            }
            if(a[i]==1){
                one++;
            }
        }
        int[]b = new int[a.length];
        for (int i = 0; i < zero; i++) {
            b[i]=0;
        }
        for (int i = zero; i < (zero+one); i++) {
            b[i]=1;
        }
        for (int i = (zero+one); i < b.length; i++) {
            b[i]=2;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
    }
}
/************************OUTPUT****************************
 Enter Array size: 8
 Enter Array element: 2 1 0 2 2 1 1 0
 0 0 1 1 1 2 2 2
 *********************************************************/

