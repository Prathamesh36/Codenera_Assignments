/*11.Write a Java program to find the second-largest element in an array of integers.*/
package Test8;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.print("Enter your array element: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=0;
        int smax=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                smax=max;
                max=a[i];
            }
            else if(a[i]>smax && a[i]<max){
                smax= a[i];
            }
        }
        System.out.println("Second largest element is: "+smax);
    }
}
/***********************OUTPUT*************************
 Enter your array size: 6
 Enter your array element: 3 4 5 8 1 9
 Second largest element is: 8
 *****************************************************/