/*5. Reducing with Lambda:
   - Write a Java program to find the sum of all elements in a list of integers using streams and a lambda expression with the reduce method.

*/
package PracticeArtiset.LambdaAndStreams.other;

import java.util.ArrayList;
import java.util.Arrays;

public class FindSumOfAllIntegersInList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(2,4,5,6,1,8,3,9));
        int sum = al.stream().reduce(0,(a,b)->a+b);
        System.out.println("Sum of elements: "+sum);

    }
}
