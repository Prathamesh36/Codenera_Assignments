/*6. Implement a Java program to remove duplicates from a sorted array.*/
package FEB7;

import java.util.ArrayList;
import java.util.Arrays;

public class Q6_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] a= {1,1,2,2,2,3,3,4,5,5,5};
        System.out.println("Array: "+ Arrays.toString(a));
        int flag=1;
        for (int i = 1; i < a.length; i++) {
            if(a[i]!=a[i-1]){
                a[flag]=a[i];
                flag++;
            }
        }
        System.out.println("After removing duplicates: "+ Arrays.toString(Arrays.copyOf(a, flag)));
    }
}
/*************************OUTPUT***************************
 Array: [1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 5]
 After removing duplicates: [1, 2, 3, 4, 5]
 ***********************************************************/