/*5. Write a Java program to find the sum of all elements in an array.*/
package FEB7;

import java.util.Arrays;

public class Q5_SumOfAllElmtsInArray {
    public static void main(String[] args) {
        int[] a= {3,8,2,1,9,4,7};
        System.out.println("Array: "+ Arrays.toString(a));
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        System.out.println("Sum of All Elements: "+sum);
    }
}
/*************************OUTPUT***************************
 Array: [3, 8, 2, 1, 9, 4, 7]
 Sum of All Elements: 34
 ***********************************************************/