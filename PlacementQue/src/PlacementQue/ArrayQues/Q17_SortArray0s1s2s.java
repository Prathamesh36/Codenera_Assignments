/*Write a program to sort an array of 0s, 1s, and 2s without using any sorting algorithm.*/
package PlacementQue.ArrayQues;

import java.util.Scanner;

public class Q17_SortArray0s1s2s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int[] a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }

    int c0=0;
    int c1=0;
    int c2=0;
            for(int i=0;i<a.length;i++){
        if(a[i]==0){
            c0++;
        }
        if(a[i]==1){
            c1++;
        }
        if(a[i]==2){
            c2++;
        }
    }
            for (int i=0;i<c0;i++){
        a[i]=0;
    }
            for (int i=c0;i<c0+c1;i++){
        a[i]=1;
    }
            for (int i=c1+c0;i<a.length;i++){
        a[i]=2;
    }
            System.out.print("Sorted Array: ");
            for (int i=0;i<a.length;i++){
        System.out.print(a[i]+ " ");
    }

    }
}
/************************OUTPUT****************************
 Enter Array size: 8
 Enter Array element: 2 1 0 1 0 0 2 1
 Sorted Array: 0 0 0 1 1 1 2 2
 *********************************************************/