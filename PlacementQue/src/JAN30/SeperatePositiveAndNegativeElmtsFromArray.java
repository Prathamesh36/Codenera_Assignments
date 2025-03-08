/*Write a Java program to separate positive and negative numbers in a given array.
Example1:-
Array = {-10, 5, 0, -9, 18, 27, -36}
Positive numbers = {5, 0, 18, 27}
Negative numbers = {-10, -9, -36}
*/
package JAN30;

import java.util.Arrays;

public class SeperatePositiveAndNegativeElmtsFromArray {
    public static void main(String[] args) {
        int[] a ={-10, 5, 0, -9, 18, 27, -36};
        System.out.println("Array: "+ Arrays.toString(a));
        int p=0,n=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>=0) p++;
            else n++;
        }
        int[] posi = new int[p];
        int[] neg = new int[n];
        int x=0, y=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>=0) posi[x++]=a[i];
            else neg[y++]=a[i];
        }
        System.out.println("Positive Numbers: "+Arrays.toString(posi));
        System.out.println("Negative Numbers: "+Arrays.toString(neg));
    }
}
