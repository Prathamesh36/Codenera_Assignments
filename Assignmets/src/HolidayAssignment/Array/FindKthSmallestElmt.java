/*52.	Write a program to find the kth smallest element in an unsorted array.*/
package HolidayAssignment.Array;

import java.util.Scanner;

public class FindKthSmallestElmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter value of k: ");
        int k= sc.nextInt();
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("kth Smallest element is: "+a[k]);
    }
}
/************************OUTPUT****************************
 Enter Array size: 6
 Enter Array element: 4 8 1 3 7 2
 Enter value of k: 2
 kth Smallest element is: 3
 *********************************************************/