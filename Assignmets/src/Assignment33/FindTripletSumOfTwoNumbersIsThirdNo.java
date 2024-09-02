/*5. Count triplets such that sum of any two number is equal to third

Input: arr[] = {1, 5, 3, 2}
Output: 2
Explanation:
In the given array, there are two such triplets such that sum of the two numbers is equal to the third number, those are –
(1, 2, 3), (3, 2, 5)*/
package Assignment33;

import java.util.Arrays;

public class FindTripletSumOfTwoNumbersIsThirdNo {
    public static void main(String[] args) {
        int[] a= {1, 5, 3, 2};
        System.out.println("Array1: "+ Arrays.toString(a));
        int c=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length ; j++) {
                int sum=a[i]+a[j];
                for (int k = 0; k < a.length; k++) {
                    if(sum==a[k]){
                        c++;
                    }
                }
            }
        }
        System.out.print("OUTPUT: "+c);
    }
}
/**********************OUTPUT************************
 Array1: [1, 5, 3, 2]
 OUTPUT: 2
 *****************************************************/