/*7. Given an array of distinct elements. Find the third largest element in it.
Suppose you have A[] = {1, 2, 3, 4, 5, 6, 7},
its output will be 5 because it is the 3 largest element in the array A.*/
package Assignment17;

import java.util.Scanner;

public class thirdLargestElmt {

    public int largest(int a[]){
        int max=0;
        int smax =-1;
        int tmax =-1;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                tmax = smax;
                smax = max;
                max = a[i];
            }
            else if(a[i]>smax && a[i]<max){
                smax=a[i];
            }
            else if(a[i]>tmax && a[i]<smax){
                tmax =a[i];
            }
        }
        return tmax;
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
        thirdLargestElmt ob = new thirdLargestElmt();
        System.out.print("Third max element is: "+ob.largest(a));
    }
}
/******************OUTPUT********************
 Enter your array size: 7
 Enter your array element: 1 2 3 4 5 6 7
 Third max element is: 5
 ********************************************/
