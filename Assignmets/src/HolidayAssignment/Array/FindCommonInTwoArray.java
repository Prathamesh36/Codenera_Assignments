/*45.	Write a program to find the common elements between two arrays.*/
package HolidayAssignment.Array;

import java.util.Scanner;

public class FindCommonInTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.print("Enter your array element: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.print("Enter your array size: ");
        int n1 = sc.nextInt();
        int[] b= new int[n1];
        System.out.print("Enter your array element: ");
        for(int i=0;i<n1;i++){
            b[i]=sc.nextInt();
        }
        int c[] = new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }
        System.out.print("Common Elements: ");
        for(int i=0;i<c.length;i++){
            int k=1;
            for(int j=i+1;j<c.length;j++){
                if(c[i]==c[j]){
                    k++;
                    c[j]=-1;
                }
            }
            if(c[i]!=-1 && k>1){
                System.out.print(c[i]+" ");
            }
        }
    }
}
/************************OUTPUT****************************
 Enter your array size: 6
 Enter your array element: 4 8 1 9 3 7
 Enter your array size: 6
 Enter your array element: 9 4 2 1 3 8
 Common Elements: 4 8 1 9 3
 *********************************************************/