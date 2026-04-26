/*
1. Write a Java program to calculate the average of a list of integers using streams.
*/
import java.util.*;

public class Q1_AverageOfListOfIntegersUsingStreamAPI {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(4, 3, 6, 2, 7, 9, null);
        System.out.println("ArrayList: "+al);
        double ans=al.stream()// Convert the list to a stream
                .filter(x -> x != null) // Filter out null values
                .mapToInt(Integer::intValue) // Map each Integer to an int
                .average()
                .orElse(0.0); // If the stream is empty, return 0.0 as the default value

        System.out.println("Average: "+ans);
    }
}
/**********************************OUTPUT*******************************
 ArrayList: [4, 3, 6, 2, 7, 9]
 Average: 5.166666666666667
 ***********************************************************************/