/*2. Choose two elements from the given array such that their sum is not present in any of the arrays

Input: A[] = {3, 2, 2}, B[] = {1, 5, 7, 7, 9}
Output: 3 9
3 + 9 = 12 and 12 is not present in
any of the given arrays.
Input: A[] = {1, 3, 5, 7}, B[] = {7, 5, 3, 1}
Output: 7 7 */
package Assignment33;

import java.util.ArrayList;
import java.util.Arrays;

public class ChooseTwoElmtSuchThatSumNotPresentInAnyOfArrays {
    public static void main(String[] args) {
        int[] a= {3, 2, 2};
        int[] b= {1,5,7,7,9};
        System.out.println("Array1: "+ Arrays.toString(a));
        System.out.println("Array2: "+ Arrays.toString(b));
        ArrayList<Integer> ob = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            ob.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            ob.add(b[i]);
        }
        int c=0;
        System.out.print("OUTPUT: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(!ob.contains(a[i]+b[j])){
                    System.out.print(a[i]+" "+b[i]);
                    c++;
                    break;
                }
            }
            if (c>0){
                break;
            }
        }
    }
}
/**********************OUTPUT************************
 Array1: [3, 2, 2]
 Array2: [1, 5, 7, 7, 9]
 OUTPUT: 3 1
 *****************************************************/