/*1.Write a Java program to find maximum product of two integers in a given array of integers.*/
package Assignment25;

import java.util.Scanner;

public class FindMaxProductOFTwoIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();
        int a[]= new int[n];
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int max=0;
        int smax=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                smax=max;
                max=a[i];
            }
            else if(a[i]>smax && a[i]<max){
                smax=a[i];
            }
        }
        System.out.println("Maximum Product: "+max*smax);
    }
}
/***************************OUTPUT*******************************
 Enter Array size: 8
 Enter Array Elements: 5 7 4 2 1 9 6 3
 Maximum Product: 63
 ***************************************************************/
