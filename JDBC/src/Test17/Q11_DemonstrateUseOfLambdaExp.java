/*11.	Write a program to demonstrate the use of lambda expressions in Java,
specifically in the context of the Stream API.*/
package Test17;

import java.util.Arrays;
import java.util.List;

public class Q11_DemonstrateUseOfLambdaExp {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = numbers.stream().filter(n -> n % 2 == 0).map(n -> n * 2).toList();

        System.out.println("Doubled Even numbers: " + result);
    }
}
/***************************OUTPUT******************************
 Doubled Even numbers: [4, 8, 12, 16, 20]
 ****************************************************************/