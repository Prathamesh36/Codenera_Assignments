/*3. Write a Java program to reverse an array.*/
package FEB7;

import java.util.Arrays;

public class Q3_ReverseArray {
    public static void main(String[] args) {
        int[] a= {3,8,2,1,9,4,7};
        System.out.println("Array: "+ Arrays.toString(a));
        int left=0;
        int right=a.length-1;
        while(left<right){
            int temp = a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
        System.out.println("Reverse Array: "+Arrays.toString(a));
    }
}
/*************************OUTPUT***************************
 Array: [3, 8, 2, 1, 9, 4, 7]
 Reverse Array: [7, 4, 9, 1, 2, 8, 3]
 ***********************************************************/