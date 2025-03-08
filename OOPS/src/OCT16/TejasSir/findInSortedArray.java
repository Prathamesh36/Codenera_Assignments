/*Q5.Given two sorted arrays arr1 and arr2 of size N and M respectively and an element K. The task is to find the element
that would be at the k’th position of the final sorted array.


Example 1:

Input:
arr1[] = {2, 3, 6, 7, 9}
arr2[] = {1, 4, 8, 10}
k = 5
Output:
6
*/
package OCT16.TejasSir;

import java.util.Scanner;

public class findInSortedArray {

    public void miniValue(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array 1 length: ");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter your array 1 element: ");
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }

        System.out.print("Enter your array 2 length: ");
        int n1= sc.nextInt();
        int b[]=new int[n1];
        System.out.print("Enter your array 2 element: ");
        for (int i=0;i<n1;i++){
            b[i]= sc.nextInt();
        }

        int c[] = new int[a.length+b.length];
        for(int i =0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[i+a.length]=b[i];
        }
        for(int i=0;i<c.length;i++){
            for (int j=i+1;j<c.length;j++){
                if(c[i]>c[j]){
                    int temp = c[i];
                    c[i]=c[j];
                    c[j]= temp;
                }
            }
        }
      /*  for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }*/
        System.out.print("Enter position to find element: ");
        int p = sc.nextInt();
        System.out.println();
        System.out.print("Element at "+p+" position is: ");
        for (int i=0;i<c.length;i++){
            if(i==p-1){
                System.out.print(c[i]);
            }
        }


    }

    public static void main(String[] args) {
        findInSortedArray ob = new findInSortedArray();
        ob.miniValue();
    }
}
