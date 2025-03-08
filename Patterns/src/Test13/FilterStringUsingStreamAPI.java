/*Q2.Given a list of strings, use the Stream API to filter out strings
starting with the letter 'A' and concatenate the remaining strings into a single
 result string.*/
package Test13;

import java.util.Arrays;
import java.util.List;


public class FilterStringUsingStreamAPI {
    public static void main(String[] args) {
        List<String> ob = Arrays.asList("apple", "banana", "orange", "avocado", "grapes");

        String result = ob.stream().filter(s->!s.startsWith("a")).toString();
        System.out.print("resultant String: "+result);
    }
}
