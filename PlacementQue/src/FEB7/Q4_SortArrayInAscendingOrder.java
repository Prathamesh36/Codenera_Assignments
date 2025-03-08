/*4.Implement a Java program to sort an array in ascending order.*/
package FEB7;

import java.util.Arrays;

public class Q4_SortArrayInAscendingOrder {
    public static void main(String[] args) {
        int[] a= {3,8,2,1,9,4,7};
        System.out.println("Array: "+ Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j]){
                    int temp =a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Ascending Array: "+Arrays.toString(a));
    }
}
/*************************OUTPUT***************************
 Array: [3, 8, 2, 1, 9, 4, 7]
 Ascending Array: [1, 2, 3, 4, 7, 8, 9]
 ***********************************************************/