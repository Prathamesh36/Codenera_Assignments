/*9.Implement a Java program to sort an array of integers in ascending order u*/
package Test8;

import java.util.Scanner;

public class SortInAsc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.print("Enter your array element: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("Array in Ascending order: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
/***********************OUTPUT*************************
 Enter your array size: 6
 Enter your array element: 4 8 1 3 7 2
 Array in Ascending order: 1 2 3 4 7 8
 *****************************************************/
