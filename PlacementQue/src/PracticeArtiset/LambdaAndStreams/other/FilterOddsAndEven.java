/*2. Filtering with Streams and Lambda:
   - Given a list of integers, write a Java program to filter out all odd numbers and collect the even numbers into a new list using streams and lambda expressions.
*/
package PracticeArtiset.LambdaAndStreams.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOddsAndEven {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(2,4,5,6,1,8,3,9));
        System.out.println("Original List: "+ al);
        List<Integer> even= al.stream().filter(a->a%2==0).collect(Collectors.toList());
        List<Integer> odd= al.stream().filter(a->a%2==1).collect(Collectors.toList());
        System.out.println("Even Numbers: "+even);
        System.out.println("Odd Numbers: "+odd);

    }
}
