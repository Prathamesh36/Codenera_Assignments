/*1. Write a Java program to find the maximum element in an array.*/
package FEB7;

import java.util.Arrays;

public class Q1_FindMaximumInArray {
    public static void main(String[] args) {
        int[] a= {4,7,2,8,9,1};
        System.out.println("Array: "+ Arrays.toString(a));
        int max=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max) max=a[i];
        }
        System.out.println("Maximum Element: "+max);

    }
}
/*************************OUTPUT***************************
 Array: [4, 7, 2, 8, 9, 1]
 Maximum Element: 9
***********************************************************/