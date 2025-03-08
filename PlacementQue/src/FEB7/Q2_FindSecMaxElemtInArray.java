/*2. Implement a Java program to find the second largest element in an array.*/
package FEB7;

import java.util.Arrays;

public class Q2_FindSecMaxElemtInArray {
    public static void main(String[] args) {
        int[] a= {3,8,2,8,9,1,9};
        System.out.println("Array: "+ Arrays.toString(a));
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
        System.out.println("Second largest Element: "+smax);
    }
}
/*************************OUTPUT***************************
 Array: [3, 8, 2, 8, 9, 1, 9]
 Second largest Element: 8
 ***********************************************************/