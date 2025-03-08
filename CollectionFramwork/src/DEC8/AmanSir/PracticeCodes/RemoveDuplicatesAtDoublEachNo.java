/*Q1.Given a list of integers, remove duplicates, double each number,
and return the first three elements in ascending order using Stream API.
*/
package DEC8.AmanSir.PracticeCodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesAtDoublEachNo {
    public static void main(String[] args) {
        List<Integer> ob = Arrays.asList(4,5,6,5,4,2,9,5);
        System.out.println(ob);
        List<Integer> li = ob.stream().distinct().collect(Collectors.toList());
        System.out.println("Remove Duplicates: "+li);
        List<Integer> db = ob.stream().map(n -> n*2).collect(Collectors.toList());
        System.out.println("Double each Number: "+db);
        List<Integer> top = ob.stream().limit(3).collect(Collectors.toList());
        System.out.println("Top 3 elements: "+top);

    }
}
